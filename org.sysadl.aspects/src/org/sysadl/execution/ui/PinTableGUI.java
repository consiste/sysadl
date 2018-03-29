package org.sysadl.execution.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
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

public class PinTableGUI implements ValueChangedListener{
	
	private JFrame guiFrame;
	private CustomListenerHashMap<Pin, Object> values;
	private ActivityDef activity;
	private boolean answeredAll;
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scrollPane;
	//private TableColumn column;

	
	public PinTableGUI( CustomListenerHashMap<Pin, Object> values, ActivityDef ac) {
		this.values = values;
		this.activity = ac;
		
		generateGUI();
		
	}
	
	private void generateGUI() {
		this.answeredAll = true;

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		guiFrame = new JFrame();
		// make sure the program exits when the frame closes
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Please insert values for the pins");
		guiFrame.setSize(400, 400);
		// This will center the JFrame in the middle of the screen
		guiFrame.setLocationRelativeTo(null);
		
		int numOfElements = this.activity.getInParameters().size();

		// creating two data structures:the column names and element values. Which the
		// JTable object
		// can recognize as arguments to the constructor
		String[] columnNames = { "Pin name", "Variable type", "Value" };
		Object[][] data = new Object[numOfElements][3];
		int count = 0;
		for (Object a : this.activity.getInParameters()) {
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
		 tableModel = new DefaultTableModel(data, columnNames) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// Only the third column
				return column == 2;
			}
		};
		table = new JTable(data, columnNames);
		table.setModel(tableModel);
		scrollPane = new JScrollPane(table);
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
				answeredAll = true;
				boolean noErros = true;
				for (Object a : PinTableGUI.this.activity.getInParameters()) {
					Pin pin = (Pin) a;
					TypeDef pinType = pin.getDefinition();
					String typeClassName = pinType.getName();
					String pinName = pin.getName();

					// PinTableGUI.this.getValues().put(pin, table.getModel().getValueAt(rowIndex++,
					// 2));
					String valueTyped = (String) table.getModel().getValueAt(rowIndex++, 2);

					try {
						if (valueTyped.equals("") && !typeClassName.equals("Void")) {
							answeredAll = false;
							System.out.println("you have skipped some values.");
						} else {
							if (typeClassName.equals("Int")) {
								Integer i = Integer.parseInt(valueTyped);
								values.put(pin, i);
							} else if (typeClassName.equals("Real")) {
								Double i = Double.parseDouble(valueTyped);
								PinTableGUI.this.values.put(pin, i);
							} else if (typeClassName.equals("Boolean")) {
								Boolean i = Boolean.parseBoolean(valueTyped);
								PinTableGUI.this.values.put(pin, i);
							} else if (typeClassName.equals("String")) {
								PinTableGUI.this.values.put(pin, valueTyped);
							} else if (typeClassName.equals("void")) {
								// it matters not what the user types. the value will be null.
								PinTableGUI.this.values.put(pin, null);
							}
						}

					} catch (Exception ex) {
						System.out.println("log: wrong type! try again.");
						valuesMessageTextArea.setText(
								"One or more values provided are not coherent \n with the pin's type. Try Again.");
						successMessageTextArea.setText("The values you typed where not saved.");
						ex.printStackTrace();
						PinTableGUI.this.values.clear();
						noErros = false;
						break;
					}

				}

				if(noErros) {
					System.out.println("map after the click: ");
					//for (PinTableGUI.this.getValues())(PinTableGUI.this.getValues());
					for (Map.Entry entry : PinTableGUI.this.values.entrySet()) {
						System.out.println(((Pin)entry.getKey()).getName() +" : "+entry.getValue() +" ("+entry.getValue().getClass().getName()+")");
					}
					valuesMessageTextArea.setText("");
					successMessageTextArea.setText("successfully saved values.");
					if (!PinTableGUI.this.answeredAll) {
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
	}

	public void setVisible(boolean b) {
		if(this.guiFrame == null) {
			System.out.println("this gui was not initialized");
		}
		else {
			this.guiFrame.setVisible(b);
		}
		
		values.setValueChangedListener(this);
		
		
	}

	public void guiRedrawTable(Pin pin) {
		TableColumn column = null;
		column = table.getColumnModel().getColumn(0);
		for (int rowIndex = 0; rowIndex < PinTableGUI.this.activity.getInParameters().size(); rowIndex++) {
			String tablePinName = (String)table.getModel().getValueAt(rowIndex, 0);
			if(pin.getName().equals(tablePinName)) {
				Object obj = values.get(pin);
				table.getModel().setValueAt(values.get(pin), rowIndex, 2);
				break;
			}
			
		}

		
	}

	@Override
	public void onChangedValue(Pin key) {
		guiRedrawTable(key);
		
	}

}
