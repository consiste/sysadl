package org.sysadl.verification.csp;

import java.awt.Point;

import javax.swing.JDialog;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public class VerificationAnwserDialog extends JDialog {
	
	 private static final long serialVersionUID = 1L;
	 
	    public VerificationAnwserDialog(JFrame parent, String title, HashMap<String, String> message, boolean error) {
	        super(parent, title);
	        System.out.println("creating the window..");
	        // set the position of the window
	        Point p = new Point(400, 400);
	        setLocation(p.x, p.y);
	        	
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
	        
		        JPanel messagePane = new JPanel();	        
		        String text = "";
		        Object[] array = message.keySet().toArray();
		        for (int i = 0; i < array.length; i++) {
		        	text += "<p style = \"color:black;\">";
		        	if (array[i].toString().contains("deadlock free")) {
						text += "Deadlock Free: ";
					}
		        	else if (array[i].toString().contains("_check")) {
						String[] aux = array[i].toString().split("_");
						text += "It is possible to find values satisfying the restrictions imposed by the constraint " + aux[0];
					}
		        	else if (array[i].toString().contains("IS_TRUE")) {
		        		String noSpaces = array[i].toString().replaceAll("\n", "").replaceAll(" ", "");
						String[] aux = noSpaces.split(",");
						String[] aux2 = aux[0].split("\\(");
						String[] aux3 = aux[1].split("\\)");
						String refinement = aux2[aux2.length-1].replaceAll("_s", "");
						refinement += " is a refinement of the action that uses the constraint " + aux3[0].replaceAll("_s", "");
						text += "The Execution " + refinement +": ";					
					}
		        	else if(array[i].toString().contains("divergence free")) {
						text += "Divergence Free: ";
		        	}
		        	else
		        		text += array[i].toString();
		        	text += "</p>";
		        	if (message.get(array[i]).toString().contains("Passed")) {
						text += "<p style = \"color:green;\">";
						text += message.get(array[i]).toString();
						text += "</p>";
					}
		        	else {
		        		text += "<p style = \"color:red;\">";
						text += message.get(array[i]).toString();
						text += "</p>";
		        	}
		        	
				}	        
		        
		        // get content pane, which is usually the
		        // Container of all the dialog's components.	        
		        messagePane.add(new JLabel("<html>" + text + "<br/>" + "</html>"));
		        getContentPane().add(messagePane);
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
