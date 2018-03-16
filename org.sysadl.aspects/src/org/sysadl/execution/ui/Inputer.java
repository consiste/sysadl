package org.sysadl.execution.ui;

import java.util.HashMap;
import java.util.Scanner;

import javafx.application.Application;
import sysADL_Sintax.ActivityDef;
import sysADL_Sintax.Pin;
import sysADL_Sintax.TypeDef;

public class Inputer extends UiActivityPinInput{

	public Inputer(ActivityDef ac) {
		super(ac);
		this.setValues(new HashMap<Pin, Object>());
	}

	@Override
	public boolean requestInputCMD() {
		boolean answeredAll = true;

		for (Object a : this.getActivity().getInParameters()) {
			Pin pin = (Pin)a;
			TypeDef pinType = pin.getDefinition();
			String typeClassName = pinType.getName();
			String pinName = pin.getName();
			
			
			System.out.println("Digite o valor do pino " + pinName + " (do tipo " + typeClassName + "):");
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				String valueTyped = sc.nextLine( );

				try {
					if ( valueTyped.equals("") && !typeClassName.equals("void")) {
						answeredAll = false;
						System.out.println("skkiped one");
					}else {
						if(typeClassName.equals("Int")) {
							Integer i= Integer.parseInt(valueTyped);
							this.getValues().put(pin, i);
						}else if(typeClassName.equals("Real")) {
							Double i = Double.parseDouble(valueTyped);
							this.getValues().put(pin, i);
						}else if(typeClassName.equals("Boolean")) {
							Boolean i = Boolean.parseBoolean(valueTyped);
							this.getValues().put(pin, i);
						}else if(typeClassName.equals("String")) {
							this.getValues().put(pin, valueTyped);
						}else if(typeClassName.equals("void")) {
							//it matters not what the user types. the value will be null.
							this.getValues().put(pin, null);
						}
					}
					break;
				}catch(Exception e) {
					System.out.println("wrong type! try again.");
					e.printStackTrace();
				}
			}
			
			
		}
		return answeredAll;
	}
	
	@Override
	public boolean requestInputGUI(String[] args) {
        Application.launch(Fx.class, args);
        return false;
	}
	
	public static void main(String args[]) {
		ActivityDef ac = TestAd.testActivity();
		Inputer inputer = new Inputer(ac);
//		inputer.requestInputCMD();
		inputer.requestInputGUI(args);
		
	}



}
