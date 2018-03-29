package org.sysadl.execution.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.sysadl.execution.value.Values;

import sysADL_Sintax.ActivityDef;
import sysADL_Sintax.Pin;
import sysADL_Sintax.TypeDef;

public class Inputer extends UiActivityPinInput  {

	private Boolean answeredAll;
	private PinTableGUI gui;

	public Inputer(ActivityDef ac) {
		super(ac);
		buildGUI();
		
	}
	


	public boolean requestInputCMD() {
		this.answeredAll = true;

		for (Object a : this.activity.getInParameters()) {
			Pin pin = (Pin) a;
			TypeDef pinType = pin.getDefinition();
			String typeClassName = pinType.getName();
			String pinName = pin.getName();

			System.out.println("Digite o valor do pino " + pinName + " (do tipo " + typeClassName + "):");
			Scanner sc = new Scanner(System.in);

			while (true) {
				String valueTyped = sc.nextLine();

				try {
					// removed the check for type void [Eduardo]
					if (valueTyped.equals("")) { // && !typeClassName.equals("Void")) { // check if should be lowercase
						answeredAll = new Boolean(false);
						System.out.println("skkiped one");
					} else {
						if (typeClassName.equals("Int")) {
							Integer i = Integer.parseInt(valueTyped);
							this.values.put(pin, i);
						} else if (typeClassName.equals("Real")) {
							Double i = Double.parseDouble(valueTyped);
							this.values.put(pin, i);
						} else if (typeClassName.equals("Boolean")) {
							Boolean i = Boolean.parseBoolean(valueTyped);
							this.values.put(pin, i);
						} else if (typeClassName.equals("String")) {
							this.values.put(pin, valueTyped);
						} else if (typeClassName.equals("void")) {
							// it matters not what the user types. the value will be null.
							// now it is VOID [Eduardo]
							this.values.put(pin, Values.VOID);
						}
					}
					break;
				} catch (Exception e) {
					System.out.println("wrong type! try again.");
					e.printStackTrace();
				}
			}

		}
		return answeredAll;
	}

	@Override
	public void requestInput() {

		//make sure the JFrame is visible
		this.gui.setVisible(true);
		//for now on, when the value of the pins in the map changes, our table will update its values accordingly
		//creating a listener to listen for the event raised by CustomListenerHashMap.
	}
	
	@Override
	public void mapChanged() {
		// TODO Auto-generated method stub
		
	}
	
	private void buildGUI() {
		this.gui = new PinTableGUI(this.values, this.activity);
		
	}
	



	public static void main(String args[]) {
		ActivityDef ac = TestAd.testActivity();
		Inputer inputer = new Inputer(ac);
		// inputer.requestInputCMD();
		inputer.requestInput();

		
		//simulando que o mapa mudou
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CAHNGED");
		inputer.getValues().put((Pin) ac.getInParameters().get(0), "99");

	}











}
