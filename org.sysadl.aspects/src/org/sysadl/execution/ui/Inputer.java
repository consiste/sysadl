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

import sysADL_Sintax.ActivityDef;
import sysADL_Sintax.Pin;
import sysADL_Sintax.TypeDef;

public class Inputer extends UiActivityPinInput {

	boolean answeredAll;

	public Inputer(ActivityDef ac) {
		super(ac);
		this.values = new HashMap<Pin, Object>();
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
					if (valueTyped.equals("") && !typeClassName.equals("Void")) { // check if should be lowercase
						answeredAll = false;
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
							this.values.put(pin, null);
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
	public boolean requestInput() {

		this.answeredAll = true;

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		JFrame guiFrame = new JFrame();
		// make sure the program exits when the frame closes
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Please insert values for the pins");
		guiFrame.setSize(400, 400);
		// This will center the JFrame in the middle of the screen
		guiFrame.setLocationRelativeTo(null);

		int numOfElements = this.getActivity().getInParameters().size();

		// creating two data structures:the column names and element values. Which the
		// JTable object
		// can recognize as arguments to the constructor
		String[] columnNames = { "Pin name", "Variable type", "Value" };
		Object[][] data = new Object[numOfElements][3];
		int count = 0;
		for (Object a : this.getActivity().getInParameters()) {
			String[] instanceOfData = new String[3];

			Pin pin = (Pin) a;
			TypeDef pinType = pin.getDefinition();
			String typeClassName = pinType.getName();
			String pinName = pin.getName();

			instanceOfData[0] = pinName;
			instanceOfData[1] = typeClassName;
			instanceOfData[2] = "";

			data[count++] = instanceOfData;
		}

		// instance table model to be the default model, but override a method so that
		// only column 2 is editable.
		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// Only the third column
				return column == 2;
			}
		};
		JTable table = new JTable(data, columnNames);
		table.setModel(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		// set property that makes the table spam all available space in height,
		// even if there are not enough rows to fill the space.
		table.setFillsViewportHeight(false);

		// change width of "value" column to be larger
		TableColumn column = null;
		for (int i = 0; i < 3; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 2) {
				column.setPreferredWidth(100); // third column is bigger
			} else {
				column.setPreferredWidth(50);
			}
		}

		// set property so that when user clicks the button (or anything else) the
		// values typed are all saved.
		table.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		
		//TODO use a Combopanel to choose from boolean values.

		//creating text space to communicate stuff to the user
		final JTextArea successMessageTextArea = new JTextArea(1, 0);
		successMessageTextArea.setEditable(false);
		final JTextArea valuesMessageTextArea = new JTextArea(2, 0);
		successMessageTextArea.setEditable(false);

		// creating the button and specifying its behavior when clicked
		JButton button = new JButton("Confirm");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// When button is pressed, check values entered (TDOO) and save them to their
				// respective pin in the map inside this.getvalues
				int rowIndex = 0;
				Inputer.this.answeredAll = true;
				boolean noErros = true;
				for (Object a : Inputer.this.getActivity().getInParameters()) {
					Pin pin = (Pin) a;
					TypeDef pinType = pin.getDefinition();
					String typeClassName = pinType.getName();
					String pinName = pin.getName();

					// Inputer.this.getValues().put(pin, table.getModel().getValueAt(rowIndex++,
					// 2));
					String valueTyped = (String) table.getModel().getValueAt(rowIndex++, 2);

					try {
						if (valueTyped.equals("") && !typeClassName.equals("Void")) {
							Inputer.this.answeredAll = false;
							System.out.println("you have skipped some values.");
						} else {
							if (typeClassName.equals("Int")) {
								Integer i = Integer.parseInt(valueTyped);
								Inputer.this.getValues().put(pin, i);
							} else if (typeClassName.equals("Real")) {
								Double i = Double.parseDouble(valueTyped);
								Inputer.this.getValues().put(pin, i);
							} else if (typeClassName.equals("Boolean")) {
								Boolean i = Boolean.parseBoolean(valueTyped);
								Inputer.this.getValues().put(pin, i);
							} else if (typeClassName.equals("String")) {
								Inputer.this.getValues().put(pin, valueTyped);
							} else if (typeClassName.equals("void")) {
								// it matters not what the user types. the value will be null.
								Inputer.this.getValues().put(pin, null);
							}
						}

					} catch (Exception ex) {
						System.out.println("wrong type! try again.");
						valuesMessageTextArea.setText(
								"One or more values provided are not coherent \n with the pin's type. Try Again.");
						successMessageTextArea.setText("The values you typed where not saved.");
						ex.printStackTrace();
						Inputer.this.getValues().clear();
						noErros = false;
						break;
					}

				}

				if(noErros) {
					System.out.println("map after the click: ");
					//for (Inputer.this.getValues())(Inputer.this.getValues());
					for (Map.Entry entry : Inputer.this.getValues().entrySet()) {
						System.out.println(((Pin)entry.getKey()).getName() +" : "+entry.getValue() +" ("+entry.getValue().getClass().getName()+")");
					}
					valuesMessageTextArea.setText("");
					successMessageTextArea.setText("successfully saved values.");
					if (!Inputer.this.answeredAll) {
						valuesMessageTextArea.setText("you skipped some values. but it's ok.");
					}
				}

			}
		});

		JPanel panel = new JPanel();
		GridLayout grid = new GridLayout(3, 1);
		panel.setLayout(grid);
		panel.add(valuesMessageTextArea);
		panel.add(successMessageTextArea);
		panel.add(button);

		guiFrame.add(panel, BorderLayout.SOUTH);
		guiFrame.add(scrollPane, BorderLayout.CENTER);

		// make sure the JFrame is visible
		guiFrame.setVisible(true);

		return false;
	}

	public static void main(String args[]) {
		ActivityDef ac = TestAd.testActivity();
		Inputer inputer = new Inputer(ac);
		// inputer.requestInputCMD();
		inputer.requestInput();

	}



}
