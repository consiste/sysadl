package org.sysadl.verification.csp;


import javax.swing.JDialog;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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


public class VerificationAnwserDialog extends JDialog {
	
	 private static final long serialVersionUID = 1L;
	 private Object keyFalse = null;
	 Object[] array = null;
	    public VerificationAnwserDialog(JFrame parent, String title, HashMap<String, String> message,HashMap<String, String> falseCase, boolean error) {
	        super(parent, title);
	        System.out.println("creating the window..");
	        // set the position of the window	        
	        setLocationRelativeTo(null);
	        array = message.keySet().toArray();	        	        
	        // Create a message
	        if (error) {
	        	JPanel messagePane = new JPanel();	        
		        String text = "";
		        Object[] key = message.keySet().toArray();
		        text += "<p style = \"color:red;\">";
		        for (int i = 0; i < key.length; i++) {
					text += message.get(key[i]).toString();
				}
		        text += "</p>";
		        messagePane.add(new JLabel("<html>" + text + "<br/>" + "</html>"));
		        getContentPane().add(messagePane);
			}
	        else {	        	 	        
		        JPanel panel = new JPanel();
		        panel.setLayout(new GridLayout(array.length,2,3,3));		        	        		       
		        JButton errorbutton = null;		       
		        for (int i = 0; i < array.length; i++) {		        			        	
		        	JPanel messagePane = new JPanel();
		        	messagePane.setLayout(new BoxLayout(messagePane, BoxLayout.LINE_AXIS));
		        	String text = "";
		        	text += "<p style = \"color:black;\">";
		        	if (array[i].toString().contains("[deadlock free]")) {
						text += "Deadlock Free: ";
					}
		        	else if(array[i].toString().contains("[T=")) {
		        		String[] aux = array[i].toString().split(" ");
		        		text+= "Safety property: " + aux[0];
		        	}
		        	else if(array[i].toString().contains("[deadlock free [FD]]")) {
		        		String[] aux = array[i].toString().split(" :");
		        		text+= "Liveness property: " + aux[0];
		        	}
		        	else if (array[i].toString().contains("_check")) {
						String[] aux = array[i].toString().split("_");
						text += "It is possible to find values satisfying the restrictions imposed by the constraint " + aux[0];
					}
		        	else if (array[i].toString().contains("subset")) {
		        		String noSpaces = array[i].toString().replaceAll("\n", "").replaceAll(" ", "");
						String[] aux = noSpaces.split(",");
						String[] aux2 = aux[0].split("\\(");
						String[] aux3 = aux[1].split("\\)");
						String refinement = aux2[aux2.length-1].replaceAll("_s", "");
						refinement += " is a refinement of the action that uses the constraint " + aux3[0].replaceAll("_s", "");
						text += "The Execution " + refinement +": ";					
					}
		        	else if(array[i].toString().contains("[divergence free]")) {
						text += "Divergence Free: ";
		        	}
		        	else
		        		text += array[i].toString();
		        	text += "</p>";
		        	if (message.get(array[i]).toString().contains("Passed") || message.get(array[i]).toString().contains("true")) {
						text += "<p style = \"color:green;\">";
						text += message.get(array[i]).toString();
						text += "</p>";
						errorbutton = new JButton("?");						
						errorbutton.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {															
								 JFrame frame = new JFrame();		               
					               String textFalseCase = "";
					               Object[] falseKeys = falseCase.keySet().toArray();
					               for (int j = 0; j < falseKeys.length; j++) {
					            	   textFalseCase += "";  
					            	   textFalseCase += falseCase.get(falseKeys[j]);
					               }
					               //createFrameWithMessage(frame, "?", textFalseCase, falseKeys);
//					               String path = System.getProperty("user.dir");
//					               makeFileWithTraces(path+"//trace");
					               
								}
							});
					}
		        	else {		        		
		        		text += "<p style = \"color:red;\">";
						text += message.get(array[i]).toString();
						keyFalse = array[i];
						errorbutton = new JButton("?");
						messagePane.add(errorbutton);						
						errorbutton.addActionListener(new ActionListener() {
						Object kf = keyFalse;
							@Override
							public void actionPerformed(ActionEvent e) {				
								
								 JFrame frame = new JFrame();		               					               
					               createFrameWithMessage(frame, "?", falseCase, kf);
					               String path = System.getProperty("user.dir");
//					               makeFileWithTraces(path+"//trace");
					               
								}
							});
						
		        	}		        	
		        	messagePane.add(new JLabel("<html>" + text + "<br/>" + "</html>"));
		        	messagePane.add(errorbutton);		        	
		        	panel.add(messagePane);
		        	
		        	
		        	
		        	
				}	        
		        
		        // get content pane, which is usually the
		        // Container of all the dialog's components.	        
		        		        		       		        
		        getContentPane().add(panel);
		        JScrollPane scrollPane = new JScrollPane(panel);
		        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		        scrollPane.setBounds(50, 30, 300, 50);
		        getContentPane().setPreferredSize(new Dimension(500, 400));
	    		getContentPane().add(scrollPane);
	    		
		    }
	        // Create a button
	        JPanel buttonPane = new JPanel();
	        JButton button = new JButton("Close");
	        	        
	        buttonPane.add(button);
	        // set action listener on the button
	        button.addActionListener(new MyActionListener());
	        getContentPane().add(buttonPane, BorderLayout.PAGE_END);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
				String[] parts = falseCase.get(key).toString().split(";");
	            String anwser = "<html>The following set " + parts[0] +" is not valid for input parameters of the " ;
	            anwser += "<br/>";
	            anwser += "equation: " + parts[1];
	            anwser += "<br/>";
	            for (int j = 2; j < parts.length; j++) {
					anwser += parts[j];
					anwser += "<br/>";
				}
	            anwser += "</html>";
	            panel.add(new JLabel(anwser));
	            frame.add(panel);
	            return;
			}
			else if(key.toString().contains("subset")) {
				String[] parts = falseCase.get(key).toString().split(";");
	            String anwser = "<html>The following set " + parts[0] +"<br/> is not a subset of the values defined by the component. ";
	            anwser += "<br/>";	           
	            
	            anwser += "</html>";
	            panel.add(new JLabel(anwser));
	            frame.add(panel);
	            return;
			}
			else if(key.toString().contains("SPEC_")) {
				String path = System.getProperty("user.dir");
				File traces = new File(path+"//trace");
				BufferedReader br;
				try {
					br = new BufferedReader(new FileReader(traces));
					String st = br.readLine();
					st = st.replaceAll("-,", "");
					st = st.replaceAll(",", "<br/>");
					st = st.replaceAll("\\.", " : ");
					st = st.replace("?", "");
					String anwser = "<html> Sequence of events:<br/>" + st + "</html>";
					panel.add(new JLabel(anwser));
					JScrollPane scrollPane = new JScrollPane(panel);
			        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			        scrollPane.setBounds(50, 30, 300, 50);
			        frame.setPreferredSize(new Dimension(500, 400));
		            frame.add(scrollPane);
		            return;
					  
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				  
				  
			}
			
            
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
