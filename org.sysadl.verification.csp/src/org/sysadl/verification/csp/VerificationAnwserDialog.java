package org.sysadl.verification.csp;


import javax.swing.JDialog;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;

import org.eclipse.core.resources.IFile;
import org.jdesktop.swingx.JXLabel;




public class VerificationAnwserDialog extends JDialog {
	 
	 private static final long serialVersionUID = 1L;
	 private Object keyFalse = null;
	 Object[] array = null;	 
	 IFile file = null;
	 
	 private JXLabel label;
	 private JPanel panel = new JPanel();
	 
	 public VerificationAnwserDialog(JFrame parent, String title, HashMap<String, String> message, HashMap<String, String> falseCase, boolean error, IFile file) {
	        super(parent, title);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//	        setPreferredSize(new Dimension(500, 400));

	        JPanel contentPane = new JPanel(new BorderLayout());
	        JButton errorButton = null;
	        
	        if (error) {
	            String text = "<html><p style=\"color:red;\">";
	            for (String key : message.keySet()) {
	                text += message.get(key);
	            }
	            text += "</p></html>";
	            label = new JXLabel(text);
	        } else {
	            StringBuilder html = new StringBuilder("<html><body>");
	            
	            for (String key : message.keySet()) {
	                String text = "<p style=\"color:black; white-space:pre-wrap;\">";

	                // Adicione lógica para gerar 'text' com base em 'key' e 'message.get(key)'
	                if (key.contains("[deadlock free]")) {
						text += "Deadlock Free: ";
					}
		        	else if(key.contains("[T=")) {
		        		String[] aux = key.split(" ");
		        		text+= "Safety property: " + aux[0];
		        	}
		        	else if(key.contains("[deadlock free [FD]]")) {
		        		String[] aux = key.split(" :");
		        		text+= "Liveness property: " + aux[0];
		        	}
		        	else if (key.contains("_check")) {
						String[] aux = key.split("_");
						text += "It is possible to find values satisfying the restrictions imposed by the constraint " + aux[0]+": ";
					}
		        	else if (key.contains("subset")) {
		        		String noSpaces = key.replaceAll("\n", "").replaceAll(" ", "");
						String[] aux = noSpaces.split(",");
						String[] aux2 = aux[0].split("\\(");
						String[] aux3 = aux[1].split("\\)");
						String refinement = aux2[aux2.length-1].replaceAll("_s", "");
						refinement += " is a refinement of the action that uses the constraint " + aux3[0].replaceAll("_s", "");
						text += "The Execution " + refinement +": ";					
					}
		        	else if(key.contains("[divergence free]")) {
						text += "Divergence Free: ";
		        	}
		        	else
		        		text += key.toString();

	                text += "<br/>" +message.get(key) + "</p>";
	                if (message.get(key).contains("Passed") || message.get(key).contains("true")) {
	                    text = text.replace("<p style=\"color:black; white-space:pre-wrap;\">", "<p style=\"color:green;\">");
	                } else {
	                    text = text.replace("<p style=\"color:black; white-space:pre-wrap;\">", "<p style=\"color:red;\">");
	                    // Adicione a lógica para lidar com o botão de erro
	                    errorButton = new JButton("?");
	                    errorButton.addActionListener( new ActionListener() {
	                    	
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame frame = new JFrame();
								createFrameWithMessage(frame, "?", falseCase, key);
								
							}
						});
	                    panel.add(errorButton);
	                }

	                html.append("<div style=\"white-space:pre-wrap;\">").append(text).append("<br/></div>");
	            }
	        
	            html.append("</body></html>");
	            label = new JXLabel(html.toString());
	            panel.add(label);
	            
	        }
	        JScrollPane scrollPane = new JScrollPane(panel);
//	        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants);
	        contentPane.add(scrollPane, BorderLayout.CENTER);

	        JPanel buttonPane = new JPanel();
	        JButton closeButton = new JButton("Close");
	        buttonPane.add(closeButton);
	        contentPane.add(buttonPane, BorderLayout.SOUTH);

	        closeButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                dispose();
	            }
	        });

	        setContentPane(contentPane);
	        setLocationRelativeTo(null);
	        pack();
	        setVisible(true);
	    }
	    
	    public void createFrameWithMessage(JFrame frame,String title, HashMap<String,String> falseCase, Object key) {
	    	frame.setTitle(title);
            frame.setSize(500, 150);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            JPanel panel = new JPanel();
            
			if (key.toString().contains("_check")) {
				frame.setTitle("Consistency problem found");
				String[] parts = falseCase.get(key).toString().split(";");
	            String anwser = "<html>It is not possible to find values for the output out for the\r\n"
	            		+ "following combinations of input values: ";	            	           
	            String[] instaces = parts[0].replace("{", "").replace("}", "").replace("(", "").replace(")", "").split(",");
	            String[] inParameters = parts[2].replace("In:", "").split("=");
	            anwser += "<ul>";
	            for (int i = 0; i < instaces.length; ) {
	            	for (int j = 0; j < inParameters.length; j = j+2) {
	            		anwser += "<li>"+ inParameters[j]+ " = " + instaces[i] +"</li>";
	            		i++;
					}	            	
				}
	            anwser += "</ul>";	            
	            anwser += "that respects the following restrictions: ";	            
	            for (int j = 2; j < parts.length; j++) {
	            	anwser += "<br/>";
	            	anwser += parts[j];					
				}
	            anwser += "equation: " + parts[1];
	            anwser += "<br/>";	            
	            anwser += "</html>";
	            panel.add(new JLabel(anwser));
	            frame.add(panel);
	            JScrollPane scrollPane = new JScrollPane(panel);
		        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//		        scrollPane.setBounds(50, 30, 300, 50);
//		        frame.setPreferredSize(new Dimension(500, 400));
	            frame.add(scrollPane);
	            return;
			}
			else if(key.toString().contains("subset")) {
				frame.setTitle("Invalid Activity Refinement");
				String[] parts = falseCase.get(key).toString().split(";");
	            String anwser = "<html>The following combinations of values for input and output\r\n"
	            		+ "parameters are not accepted by <br/>the component behaviour but are\r\n"
	            		+ "present in the component execution: ";
	            anwser += "<br/>";	           	            
	            String[] instaces = parts[0].replace("{", "").replace("}", "").replace("(", "").replace(")", "").split(",");
	            String[] inParameters = null;
	            String[] outParameters = null;
	            
	            inParameters = parts[1].replace("In:", "").split("=");
	            outParameters = parts[2].replace("Out:", "").split("=");
	            
	            anwser += "<ul>";
	            for (int i = 0; i < instaces.length; i++) {
	            	anwser += "<li>";
	            	for (int j = 0; j < inParameters.length; j = j+2) {
	            		anwser += inParameters[j]+ " = " + instaces[i];
	            		i++;
					}	            	
	            	anwser += ", ";
	            	for (int j = 0; j < outParameters.length; j = j+2) {
	            		anwser += outParameters[j]+ " = " + instaces[i] ;
					}
	            	anwser += "</li>";
				}
	            anwser += "</ul>";
	            anwser += "</html>";
	            panel.add(new JLabel(anwser));
	            frame.add(panel);
	            JScrollPane scrollPane = new JScrollPane(panel);
		        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//		        scrollPane.setBounds(50, 30, 300, 50);
//		        frame.setPreferredSize(new Dimension(500, 400));
	            frame.add(scrollPane);
	            return;
			}
			else if(key.toString().contains("SPEC_") || 
					key.toString().contains("[deadlock free]") || 
					key.toString().contains("[divergence free]")) {
				frame.setTitle("List of Events");
				String path = System.getProperty("user.dir");
				File traces = new File(path+"//trace");
				BufferedReader br;
				try {
					br = new BufferedReader(new FileReader(traces));
					String st = br.readLine();
					br.close();
					HashMap<String, String> mapTrace = new HashMap<String, String>();
					String[] values = st.split(":");
					for(int i =1; i < values.length; i=i+2) {
						mapTrace.put(values[i], values[i+1]);
					}
					st = mapTrace.get(((String) key).split(" ")[0]);
					st = st.replaceAll("-,", "").trim();
					st = st.replaceAll("τ", "").trim();
					st = st.replaceAll("✓", "").trim();
					st = st.replaceAll(",", "<br/>");
					st = st.replaceAll("(\\s*<br\\/>\\s*)+", "<br/>").trim();
					st = st.replaceAll("\\.", " : ").trim();
					st = st.replace("?", "").trim();
					String anwser = "<html> Sequence of events:<br/>" + st + "</html>";
					panel.add(new JLabel(anwser));				
					JScrollPane scrollPane = new JScrollPane(panel);
			        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//			        scrollPane.setBounds(50, 30, 300, 50);
//			        frame.setPreferredSize(new Dimension(500, 400));
		            frame.add(scrollPane);
		            JButton btn = new JButton("Show on diagram");
//		            ------------------------------------------------------------------------------
//		            IWorkbenchWindow[] window = PlatformUI.getWorkbench().getWorkbenchWindows();
//		            IWorkbenchPage page = window[0].getActivePage();
//		            page.getViewReferences()[0].getView(true);
//		            ------------------------------------------------------------------------------
//		            URI myRepresentationsFileURI = URI.createFileURI(this.file.getLocation().toOSString().replace("My.sysadl", "representations.aird"));
//					Session siriusSession =
//						SessionManager.INSTANCE.getSession(myRepresentationsFileURI, new NullProgressMonitor());
//		            Session s = null;
//		            UserSession test = new UserSession(s);
//		            SessionEditorInput ed = new SessionEditorInput(myRepresentationsFileURI, "teste", null);
//		            ResourceSet rs = new ResourceSetImpl(); 
//		            Resource rsc = rs.createResource(myRepresentationsFileURI);
//		            DAnalysis root = (DAnalysis) rsc.getResourceSet()
//		            DView dView = root.getOwnedViews().get(0);		            
//		            test.openRepresentation(this.file.getLocation().toOSString().replace("My.sysadl", "representations.aird"));
					// get representation
					//Resource res = new ResourceSetImpl().getResource(this.file.getLocationURI(), false);
					//DAnalysis root = (DAnalysis) siriusSession.getSessionResource()
						//	.getContents().get(0);
					//EList<DView> views = root.getOwnedViews();
//		            Session session = SessionManager.INSTANCE.getSession(myRepresentationsFileURI, new NullProgressMonitor());
//		            session.open(new NullProgressMonitor());
////		            Collection<DRepresentationDescriptor> node = DialectManager.INSTANCE.getAllRepresentationDescriptors(session);		            
//		        	DAnalysis root=(DAnalysis)session.getSessionResource().getContents().get(0);
//		            //------------------------------------------------------------
//		            EObject modelElement = null;
//					ArrayList<EObject> dSemanticReferences = new ArrayList<EObject>(new EObjectQuery(root)
//							.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));
//					
//					Collection<EObject> result = new EObjectQuery(session.getSessionResource().getContents().get(0)).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
//					EObjectQuery eObjectQuery = new EObjectQuery(null);
//					eObjectQuery.getInverseReferences(root.getUid());
//
//					                EObject ref = dSemanticReferences.get(0); //HERE .get(0) returns some virtual DEdge that I don't see on the diagram, but if I use .get(1) then it works. and this is random, sometime .get(0) sometimes .get(1).
//		                                        if (ref instanceof DEdge) {
//
//							if ((((DEdge) ref).getSourceNode() instanceof DNodeSpec)) {
//								System.out.println("teste1");
//								if ((((DEdge) ref).getTargetNode() instanceof DNodeSpec)) {
//									System.out.println("teste1");
//								}
////								ArrayList<EObject> viewElementReferences = new ArrayList<EObject>(
////										new EObjectQuery(ref).getInverseReferences(NotationPackage.Literals.VIEW__ELEMENT));
////		                                               viewElementReferences.get(0);
//							}
//		                 }
		            
		            //------------------------------------------------------------
		            
		            		        			    				    	
//		        	List<DView> dViews = root.getOwnedViews();		        	
//		        	for (DView object : dViews) {
//						for (DRepresentationDescriptor test : object.getOwnedRepresentationDescriptors()) {
//							if(test.getName().equals("Internal Block Diagram (Structural IBD)")) {
//								this.config = test;
//								break;
//							}
//						} 
//					}
//		            btn.addActionListener(new ActionListener() {					
//							@Override
//							public void actionPerformed(ActionEvent e) {
//									Traceability t = new Traceability();
//									HashMap m = new HashMap<String, Object>();
//									m.put("componnet", config);
//									t.execute((Collection<? extends EObject>) new ArrayList<Object>(), m);
//								}
//							});
//		            frame.add(btn, BorderLayout.PAGE_END);
		           
		            
		            return;
					  
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				  
				  
			}
			JScrollPane scrollPane = new JScrollPane(panel);
	        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setBounds(50, 30, 300, 50);
	        frame.setPreferredSize(new Dimension(500, 400));
            frame.add(scrollPane);
            
	    }	    	   
	 
	    // override the createRootPane inherited by the JDialog, to create the rootPane.
	    // create functionality to close the window when "Escape" button is pressed
	    public JRootPane createRootPane() {
	        JRootPane rootPane = new JRootPane();
	        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
	        Action action = new AbstractAction() {
	             
	            private static final long serialVersionUID = 1L;
	 
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("escaping..");
	                setVisible(false);
	                dispose();
	            }
	        };
	        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	        inputMap.put(stroke, "ESCAPE");
	        rootPane.getActionMap().put("ESCAPE", action);
	        return rootPane;
	    }
	 
	    // an action listener to be used when an action is performed
	    // (e.g. button is pressed)
	    class MyActionListener implements ActionListener {
	 
	        //close and dispose of the window.
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("disposing the window..");
	            setVisible(false);
	            dispose();
	        }
	    }
	
}
