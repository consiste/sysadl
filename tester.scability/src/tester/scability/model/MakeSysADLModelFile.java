package tester.scability.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import org.csp.translater.main.Generate;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.sysadl.verification.csp.ParserAnswerCSP;
import org.sysadl.verification.csp.VerificationAnwserDialog;
import org.sysadl.verification.transformation.PerformTransformation;

import uk.ac.ox.cs.fdr.Assertion;
import uk.ac.ox.cs.fdr.Counterexample;
import uk.ac.ox.cs.fdr.FileLoadError;
import uk.ac.ox.cs.fdr.InputFileError;
import uk.ac.ox.cs.fdr.Session;
import uk.ac.ox.cs.fdr.fdr;


public class MakeSysADLModelFile {
	
	private int index;
	String types = "";
	String ports = "";
	String connectors = "";
	String componentsImports;
	String ComponentDefRTCSystemCFD= "";
	String ComponentsRTCSystemCFD_Componet= "";
	String ComponentsRTCSystemCFD_Connectors= "";
	String finish= "";
	String ComponetDefRoomTemperatureControllerCP= "";
	String componetsDef= "";
	String behavior= "";
	String allocations = "";
	
	public void contentsModel(int index) {
		this.index = index;
		this.types = "package types {\r\n"
				+ "  value type Int {}\r\n"
				+ "  value type Boolean {}\r\n"
				+ "  value type String {}\r\n"
				+ "  value type Void {}\r\n"
				+ "  \r\n"
				+ "  enum Command {On , Off }\r\n"
				+ "  datatype Commands {attributes : heater : Command ; cooler : Command ; }\r\n"
				+ "   \r\n"
				+ "  unit Fahrenheit {dimension = Temperature }\r\n"
				+ "  value type temperature extends Real { dimension = Temperature }\r\n"
				+ "  value type FahrenheitTemperature extends temperature { unit = Fahrenheit dimension = Temperature } value type temperatureCelsius extends Int { dimension = Temperature }\r\n"
				+ "  value type Real { } dimension Temperature unit Celsius { dimension = Temperature } value type CelsiusTemperature extends temperatureCelsius { unit = Celsius dimension = Temperature } }\n";
		
		this.ports = "package Ports { import types ; port def FTemperatureOPT { flow out FahrenheitTemperature }\r\n"
				+ "  port def PresenceIPT { flow in Boolean }\r\n"
				+ "  port def PresenceOPT { flow out Boolean }\r\n"
				+ "  port def CTemperatureIPT { flow in CelsiusTemperature }\r\n"
				+ "  port def CommandIPT { flow in Command }\r\n"
				+ "  port def CommandOPT { flow out Command }\r\n"
				+ "  port def CTemperatureOPT { flow out CelsiusTemperature }\r\n"
				+ "  }\n";
		
		this.connectors = "package Connectors { import types ; import Ports ; connector def FahrenheitToCelsiusCN { participants : ~ Ft : FTemperatureOPT ; ~ Ct : CTemperatureIPT ; flows : FahrenheitTemperature from Ft to Ct }\r\n"
				+ "  connector def PresenceCN { participants : ~ pOut : PresenceOPT ; ~ pIn : PresenceIPT ; flows : Boolean from pOut to pIn }\r\n"
				+ "  connector def CommandCN { participants : ~ commandOut : CommandOPT ; ~ commandIn : CommandIPT ; flows : Command from commandOut to commandIn }\r\n"
				+ "  connector def CTemperatureCN { participants : ~ CtOut : CTemperatureOPT ; ~ ctIn : CTemperatureIPT ; flows : CelsiusTemperature from CtOut to ctIn }\r\n"
				+ "  }\n";
		
		this.componentsImports = "package Components { import Connectors ; import types ; import Ports ;\n";
		
		this.ComponentDefRTCSystemCFD = "component def RTCSystemCFD {	 \r\n" + 
				"		configuration {";
		if(index == 0) {
			this.ComponentsRTCSystemCFD_Componet += "components : \r\n";
			this.ComponentsRTCSystemCFD_Componet +=  
					"				s1"+10 +": TemperatureSensorCP {	 using ports : current1"+10 +" : FTemperatureOPT ; }\r\n" + 
							"	  			s2"+10 +" : TemperatureSensorCP {	 using ports : current2"+10 +" : FTemperatureOPT ; }\r\n" + 
							"	  			s3"+10 +" : PresenceSensorCP {	 using ports : detectedS"+10 +" : PresenceOPT ; }\r\n" + 
							"	  			ui"+10 +" : UserInterfaceCP {	 using ports : desired"+10 +" : CTemperatureOPT ; }\r\n" + 
							"	  			a2"+10 +" : CoolerCP {	 using ports : controllerC"+10 +" : CommandIPT ; }\r\n" + 
							"	  			a1"+10 +" : HeaterCP {	 using ports : controllerH"+10 +" : CommandIPT ; }\r\n" + 
							"	  			rtc"+10 +" : RoomTemperatureControllerCP {	 \r\n" + 
							"					  using ports : \r\n" + 
							"					  detected"+10 +" : PresenceIPT ; \r\n" + 
							"					  localtemp1"+10 +" : CTemperatureIPT ; \r\n" + 
							"					  localTemp2"+10 +" : CTemperatureIPT ; \r\n" + 
							"					  userTemp"+10 +" : CTemperatureIPT ; \r\n" + 
							"					  heating"+10 +" : CommandOPT ; \r\n" + 
							"					  cooling"+10 +" : CommandOPT ; }\r\n";
							
		}else {//if(index < 10){
			this.ComponentsRTCSystemCFD_Componet +=  
					"				s1"+(10+(index*10)) +": TemperatureSensorCP {	 using ports : current1"+(10+(index*10)) +" : FTemperatureOPT ; }\r\n" + 
							"	  			s2"+(10+(index*10)) +" : TemperatureSensorCP {	 using ports : current2"+(10+(index*10)) +" : FTemperatureOPT ; }\r\n" + 
							"	  			s3"+(10+(index*10)) +" : PresenceSensorCP {	 using ports : detectedS"+(10+(index*10)) +" : PresenceOPT ; }\r\n" + 
							"	  			ui"+(10+(index*10)) +" : UserInterfaceCP {	 using ports : desired"+(10+(index*10)) +" : CTemperatureOPT ; }\r\n" + 
							"	  			a2"+(10+(index*10)) +" : CoolerCP {	 using ports : controllerC"+(10+(index*10)) +" : CommandIPT ; }\r\n" + 
							"	  			a1"+(10+(index*10)) +" : HeaterCP {	 using ports : controllerH"+(10+(index*10)) +" : CommandIPT ; }\r\n" + 
							"	  			rtc"+(10+(index*10)) +" : RoomTemperatureControllerCP {	 \r\n" + 
							"					  using ports : \r\n" + 
							"					  detected"+(10+(index*10)) +" : PresenceIPT ; \r\n" + 
							"					  localtemp1"+(10+(index*10)) +" : CTemperatureIPT ; \r\n" + 
							"					  localTemp2"+(10+(index*10)) +" : CTemperatureIPT ; \r\n" + 
							"					  userTemp"+(10+(index*10)) +" : CTemperatureIPT ; \r\n" + 
							"					  heating"+(10+(index*10)) +" : CommandOPT ; \r\n" + 
							"					  cooling"+(10+(index*10)) +" : CommandOPT ; }\r\n";
		}
		
		
		if (index == 0) {
			this.ComponentsRTCSystemCFD_Connectors += "connectors : \r\n";
			this.ComponentsRTCSystemCFD_Connectors +=
					"	  			c1"+10 +" : FahrenheitToCelsiusCN bindings current1"+10 +" = localtemp1"+10 +" ; \r\n" + 
					"	  			uc"+10 +" : CTemperatureCN bindings desired"+10 +" = userTemp"+10 +" ; \r\n" + 
					"	  			cc2"+10 +" : CommandCN bindings cooling"+10 +" = controllerC"+10 +" ; \r\n" + 
					"	  			pc"+10 +" : PresenceCN bindings detectedS"+10 +" = detected"+10 +" ; \r\n" + 
					"	  			c2"+10 +" : FahrenheitToCelsiusCN bindings current2"+10 +" = localTemp2"+10 +" ; \r\n" + 
					"	  			cc1"+10 +" : CommandCN bindings heating"+10 +" = controllerH"+10 +" ;\n\n";		

			
		}else {
			this.ComponentsRTCSystemCFD_Connectors +=
					"	  			c1"+(10+(index*10)) +" : FahrenheitToCelsiusCN bindings current1"+(10+(index*10)) +" = localtemp1"+(10+(index*10)) +" ; \r\n" + 
					"	  			uc"+(10+(index*10)) +" : CTemperatureCN bindings desired"+(10+(index*10)) +" = userTemp"+(10+(index*10)) +" ; \r\n" + 
					"	  			cc2"+(10+(index*10)) +" : CommandCN bindings cooling"+(10+(index*10)) +" = controllerC"+(10+(index*10)) +" ; \r\n" + 
					"	  			pc"+(10+(index*10)) +" : PresenceCN bindings detectedS"+(10+(index*10)) +" = detected"+(10+(index*10)) +" ; \r\n" + 
					"	  			c2"+(10+(index*10)) +" : FahrenheitToCelsiusCN bindings current2"+(10+(index*10)) +" = localTemp2"+(10+(index*10)) +" ; \r\n" + 
					"	  			cc1"+(10+(index*10)) +" : CommandCN bindings heating"+(10+(index*10)) +" = controllerH"+(10+(index*10)) +" ;\n\n";
		}				
		
		
		this.finish = "}}\n";
		
		
		this.ComponetDefRoomTemperatureControllerCP = "component def RoomTemperatureControllerCP {	 \r\n" + 
				"		ports : detectedRTC : PresenceIPT ; \r\n" + 
				"		localtemp1 : CTemperatureIPT ; \r\n" + 
				"		localTemp2 : CTemperatureIPT ; \r\n" + 
				"		userTempRTC : CTemperatureIPT ; \r\n" + 
				"		heatingRTC : CommandOPT ; \r\n" + 
				"		coolingRTC : CommandOPT ; \r\n" + 
				"		configuration {	 \r\n" + 
				"			components : \r\n" + 
				"				sm : SensorsMonitorCP {	 using ports : s1 : CTemperatureIPT ; s2 : CTemperatureIPT ; average : CTemperatureOPT ; }\r\n" + 
				"	  			cm : CommanderCP {	 using ports : target2 : CTemperatureIPT ; average2 : CTemperatureIPT ; heating : CommandOPT ; cooling : CommandOPT ; }\r\n" + 
				"	  			pc : PresenceCheckerCP {	 using ports : detected : PresenceIPT ; userTemp : CTemperatureIPT ; target : CTemperatureOPT ; }\r\n" + 
				"	  		connectors : \r\n" + 
				"	  			target : CTemperatureCN bindings target = target2 ; \r\n" + 
				"	  			average : CTemperatureCN bindings average = average2 ; \r\n" + 
				"	  		delegations : \r\n" + 
				"	  			userTemp to userTempRTC \r\n" + 
				"	  			detected to detectedRTC \r\n" + 
				"	  			s1 to localtemp1 \r\n" + 
				"	  			s2 to localTemp2 \r\n" + 
				"	  			heating to heatingRTC \r\n" + 
				"	  			cooling to coolingRTC }\r\n" + 
				"	  } \r\n" + 
				"	  boundary\n";
		
		this.componetsDef = "component def TemperatureSensorCP {	 ports : current : FTemperatureOPT ; } boundary\r\n" + 
				"	component def PresenceSensorCP {	 ports : detected : PresenceOPT ; } boundary\r\n" + 
				"	component def UserInterfaceCP {	 ports : desired : CTemperatureOPT ; } boundary\r\n" + 
				"	component def HeaterCP {	 ports : controllerH : CommandIPT ; } boundary\r\n" + 
				"	component def CoolerCP {	 ports : controllerC : CommandIPT ; }\r\n" + 
				"\r\n" + 
				"	component def PresenceCheckerCP {	 ports : detected : PresenceIPT ; userTemp : CTemperatureIPT ; target : CTemperatureOPT ; }\r\n" + 
				"\r\n" + 
				"	component def CommanderCP {	 ports : target2 : CTemperatureIPT ; average2 : CTemperatureIPT ; heating : CommandOPT ; cooling : CommandOPT ; }\r\n" + 
				"\r\n" + 
				"	component def SensorsMonitorCP { ports : s1 : CTemperatureIPT ; s2 : CTemperatureIPT ; average : CTemperatureOPT ; }\r\n" + 
				"\n";
		
		this.behavior = "constraint CalculateAverageTemperatureEQ ( t1 : CelsiusTemperature , t2 : CelsiusTemperature ) : ( av : CelsiusTemperature ) {\r\n"
				+ "		equation = av == (t1 + t2)/2\r\n"
				+ "	}"
				+ "activity def CalculateAverageTemperatureAC ( s1 : CelsiusTemperature ) ( s2 : CelsiusTemperature ) : ( average : CelsiusTemperature ) { body { actions : CalcAvTemp : CalculateAverageTemperatureAN { using pins : s1 : CelsiusTemperature ; s2 : CelsiusTemperature ; } delegate s1 to s1 delegate s2 to s2 delegate average to CalcAvTemp } } action def CalculateAverageTemperatureAN ( t1 : CelsiusTemperature , t2 : CelsiusTemperature ) : CelsiusTemperature { constraint : post-condition CalculateAverageTemperatureEQ } \r\n"
				+ "	activity def CheckPresenceToSetTemperatureAC ( detected : Boolean ) ( userTemp : CelsiusTemperature ) : ( target : CelsiusTemperature ) { body { actions : CheckPeresenceToSetTemperatureAN : CheckPeresenceToSetTemperatureAN { using pins : detected : Boolean ; userTemp : CelsiusTemperature ; } delegate detected to detected delegate userTemp to userTemp delegate target to CheckPeresenceToSetTemperatureAN } } \r\n"
				+ "	activity def DecideCommandAC ( target2 : CelsiusTemperature ) ( average2 : CelsiusTemperature ) : ( cooling : Command , heating : Command ) { body { actions : ct : CompareTemperatureAN { using pins : target2 : CelsiusTemperature ; average2 : CelsiusTemperature ;  } cmdH : CommandHeaterAN { using pins : cmdsH : Commands ; } cmdC : CommandCoolerAN { using pins : cmdsC : Commands ; } delegate average2 to average2 delegate target2 to target2 delegate heating to cmdH delegate cooling to cmdC flow from ct to cmdsH flow from ct to cmdsC } } \r\n"
				+ "	activity def FahrenheitToCelsiusAC ( current1 : FahrenheitTemperature ) : ( loalTemp1 : CelsiusTemperature ) { body { actions : FtC : FahrenheitToCelsiusAN { using pins : current1 : FahrenheitTemperature ; } delegate loalTemp1 to FtC delegate current1 to current1 } } \r\n"
				+ "	action def CompareTemperatureAN ( target2 : CelsiusTemperature, average2 : CelsiusTemperature) : Commands { constraint : post-condition CompareTemperatureEQ } \r\n"
				+ "	action def CommandHeaterAN ( cmds : Commands ) : Command { constraint : post-condition CommandHeaterEQ } \r\n"
				+ "	action def CommandCoolerAN ( cmds : Commands ) : Command { constraint : post-condition CommandCoolerEQ } \r\n"
				+ "	constraint CompareTemperatureEQ ( target : CelsiusTemperature , average : CelsiusTemperature ) : ( cmds : Commands ) \r\n"
				+ "	{ equation = average > target ? cmds == types.Commands.heater->Off && types.Commands.cooler->On : cmds == types.Commands.heater->On && types.Commands.cooler->Off } \r\n"
				+ "	constraint FahrenheitToCelsiusEQ ( f : FahrenheitTemperature ) : ( c : CelsiusTemperature ) { equation = c == (5*(f - 32)/9) } \r\n"
				+ "	constraint CommandHeaterEQ ( cmds : Commands ) : ( c : Command ) { equation = c == cmds->heater } \r\n"
				+ "	constraint CommandCoolerEQ ( cmds : Commands ) : ( c : Command ) {equation = c == cmds->cooler } \r\n"
				+ "	action def FahrenheitToCelsiusAN ( current1 : FahrenheitTemperature ) : CelsiusTemperature { constraint : post-condition FahrenheitToCelsiusEQ } 	\r\n"
				+ "	action def CheckPeresenceToSetTemperatureAN ( detected : Boolean , userTemp : CelsiusTemperature ) : CelsiusTemperature { constraint : post-condition CheckPresenceToSetTemperatureEQ } \r\n"
				+ "	constraint CheckPresenceToSetTemperatureEQ ( detected : Boolean , userTemp : CelsiusTemperature ) : ( target : CelsiusTemperature ) {equation = detected == true ? target == userTemp : target == 1 } \r\n"
				+ "	executable def CommandCoolerEx(in cmds:Commands): out Command{return cmds->cooler ; }\r\n"
				+ "	executable def CommandHeaterEx(in cmds:Commands): out Command{return cmds->heater ; }\r\n"
				+ "	executable def FahrenheitToCelsiusEx(in f:FahrenheitTemperature): out CelsiusTemperature{return 5*(f-32)/9 ; }\r\n"
				+ "	executable def CalculateAverageTemperatureEx(in temp1:CelsiusTemperature,in temp2:CelsiusTemperature):out CelsiusTemperature{return (temp1 + temp2)/2 ; }\r\n"
				+ "	executable def CheckPresenceToSetTemperature(in presence:Boolean, in userTemp:CelsiusTemperature):out CelsiusTemperature{if(presence == true) return userTemp; else return 1; }\r\n"
				+ "	executable def CompareTemperatureEx(in target:CelsiusTemperature, in average:CelsiusTemperature):out Commands{let heater:Command = types.Command::Off; let cooler:Command = types.Command::Off; if(average > target) {heater = types.Command::Off; cooler = types.Command::On ; } else {heater = types.Command::On; cooler = types.Command::Off ;} } \r\n"
				+ "	constraint SPEC01EQ ( cooler : Command , heater : Command ) : ( result : Boolean ) { equation = ~ (cooler == types.Commands.heater->On && heater == types.Commands.heater->On)  } \r\n"
				+ "	action def SPEC_S_01 ( controllerC"+(10+(index*10)) +" : Command , controllerH"+(10+(index*10)) +" : Command ) : Boolean { constraint : post-condition SPEC01EQ delegate cooler to controllerC"+(10+(index*10)) +" delegate heater to controllerH"+(10+(index*10)) +" delegate SPEC_S_01 to result delegate controllerC to cooler delegate controllerH to heater } \r\n"
				+ "	 \r\n"
				+ "	constraint SPEC02EQ ( detectedS : Boolean , current1 : CelsiusTemperature, current2 : CelsiusTemperature, controllerH : Command, controllerC : Command ) : ( result : Boolean ) { equation = (detectedS == false && (((5*(current1 - 32)/9))+((5*(current2 - 32)/9)))/2 > 1 implies (controllerC == types.Commands.cooler->On && controllerH == types.Command.heater->Off)) && (detectedS == false && (((5*(current1 - 32)/9))+((5*(current2 - 32)/9)))/2 < 1 implies (controllerC == types.Command.cooler->Off && controllerH == types.Command.heater->On))}   \r\n"
				+ "	    \r\n"
				+ "	action def SPEC_L_02 ( detectedS"+(10+(index*10)) +" : Boolean , current1"+(10+(index*10)) +" : CelsiusTemperature, current2"+(10+(index*10)) +" : CelsiusTemperature, controllerH"+(10+(index*10)) +" : Command, controllerC"+(10+(index*10)) +" : Command ) : Boolean { constraint : post-condition SPEC02EQ delegate detectedS to detectedS"+(10+(index*10)) +" delegate current2 to current2"+(10+(index*10)) +" delegate controllerC to controllerC"+(10+(index*10)) +" delegate controllerH to controllerH"+(10+(index*10)) +" delegate current1 to current1"+(10+(index*10)) +" delegate SPEC_L_02 to result } \r\n"
				+ "	 }\n";
		
		this.allocations = "allocations { \r\n" + 
				"		activity FahrenheitToCelsiusAC to FahrenheitToCelsiusCN \r\n" + 
				"		activity DecideCommandAC to CommanderCP \r\n" + 
				"		activity CheckPresenceToSetTemperatureAC to PresenceCheckerCP \r\n" + 
				"		activity CalculateAverageTemperatureAC to SensorsMonitorCP \r\n" + 
				"		executable FahrenheitToCelsiusEx to FahrenheitToCelsiusAN \r\n" + 
				"		executable CompareTemperatureEx to CompareTemperatureAN \r\n" + 
				"		executable CommandHeaterEx to CommandHeaterAN \r\n" + 
				"		executable CommandCoolerEx to CommandCoolerAN \r\n" + 
				"		executable CheckPresenceToSetTemperature to CheckPeresenceToSetTemperatureAN \r\n" + 
				"		executable CalculateAverageTemperatureEx to CalculateAverageTemperatureAN }\n";
		
		
		
	}
	
	public void executeTest(int index) {
		String path = "";
		//if(index <= 10) {
			path = "D:\\RTCScability\\RTC-"+(index);
//		}else
//			path = "D:\\RTCScability\\RTC-"+index;
		
		URI modelURI = URI.createFileURI(path+".sysadl");//sysadl model		
		File folder = new File(path+"\\"+ "output");
		List<String> arguments = new ArrayList<String>();		
		HashMap<String, String> mapAnwser = new HashMap<String, String>();			
		try {
			Generate generator = new Generate(modelURI, folder, arguments);
			generator.addPropertiesFile(path+".sysadl");         
            generator.doGenerate(new BasicMonitor()); 
            Session session = new Session();
            try {            	
            	session.loadFile(folder.getAbsolutePath() + "\\sysadl2csp.csp");
            	for (Assertion assertion : session.assertions()) {
    	            assertion.execute(null);    	
    	            mapAnwser.put(assertion.toString(), (assertion.passed() ? "Passed" : "Failed"));
    	            
//    	            System.out.println(assertion.toString()+" "+
//    	                (assertion.passed() ? "Passed" : "Failed"));
            	}
                
			} catch (InputFileError error) {
		        System.out.println(error);
		    }
		    catch (FileLoadError error) {
		        System.out.println(error);
		    }

		    fdr.libraryExit();				    		    		
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void executeByIndex(int index) {
		String time = "";
		long sum = 0;
		try {
		for (int j = 0; j < 12; j++) {
			sum = 0;
			long inicio = System.currentTimeMillis();
			executeTest(index);
			long fim  = System.currentTimeMillis();
			time += "time (ms): " + (fim - inicio) + "\n";
			sum += fim-inicio;
		}
			time += "avg (ms): " +(sum/12)+"\n";
			FileWriter fileTime = new FileWriter("D:\\RTCScability\\RTC-"+index+"\\output\\time.txt");		
			fileTime.write(index+"\n");
			fileTime.write(time);
			fileTime.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void makeFile() {
		String time;
		long sum;
		//instantiations for 10,20,30,40,50,60,70,80,90,100		
		for (int i = 0; i <= 100; i++) {
			time = "";
			sum = 0;
			contentsModel(i);			
			try {
				System.out.println(i);
				
					FileWriter file = new FileWriter("D:\\RTCScability\\RTC-"+(10+(i*10))+".sysadl");
					file.write("Model SysADLModel ; \n");
					file.write(this.types);
					file.write(this.ports);
					file.write(this.connectors);
					file.write(this.componentsImports);
					file.write(this.ComponentDefRTCSystemCFD);
					file.write(this.ComponentsRTCSystemCFD_Componet);
					file.write(this.ComponentsRTCSystemCFD_Connectors);
					file.write(this.finish);
					file.write(this.ComponetDefRoomTemperatureControllerCP);
					file.write(this.componetsDef);
					file.write(this.behavior);
					file.write(this.allocations);										
					file.close();
								
//				for (int j = 0; j < 12; j++) {
//					long inicio = System.currentTimeMillis();
//					executeTest(i);
//					long fim  = System.currentTimeMillis();
//					time += "time (ms): " + (fim - inicio) + "\n";
//					sum += fim-inicio;
//				}
//				time += "avg (ms): " +(sum/10)+"\n";
//				FileWriter fileTime = new FileWriter("D:\\RTCScability\\RTC-"+(10+(i*10))+"\\output\\time.txt");
//				fileTime.write((10+(i*10))+"\n");
//				fileTime.write(time);
//				fileTime.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//instantiations for 200,300,400,500,600,700,800,900,1000
//		for (int i = 110; i <= 1000; i = i+10) {
//			time = "";
//			sum = 0;
//			contentsModel(i);			
//			try {
//				FileWriter file = new FileWriter("D:\\RTCScability\\RTC-"+i+".sysadl");
//				file.write("Model SysADLModel ; \n");
//				file.write(this.types);
//				file.write(this.ports);
//				file.write(this.connectors);
//				file.write(this.componentsImports);
//				file.write(this.ComponentDefRTCSystemCFD);				
//				file.write(this.ComponentsRTCSystemCFD_Componet);
//				file.write(this.ComponentsRTCSystemCFD_Connectors);
//				file.write(this.finish);
//				file.write(this.ComponetDefRoomTemperatureControllerCP);
//				file.write(this.componetsDef);
//				file.write(this.behavior);
//				file.write(this.allocations);
//				
//				file.close();
//				
//				for (int j = 0; j < 12; j++) {
//					long inicio = System.currentTimeMillis();
//					executeTest(i);
//					long fim  = System.currentTimeMillis();
//					time += "time (ms): " + (fim - inicio) + "\n";
//					sum += fim-inicio;
//				}
//				time += "avg (ms): " +(sum/10)+"\n";
//				FileWriter fileTime = new FileWriter("D:\\RTCScability\\RTC-"+i+"\\output\\time.txt");
//				fileTime.write(time);
//				fileTime.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		//instantiations for 100,200,300,400,500,600,700,800,900,1000
//		for (int i = 100; i < 1000; i = i+100) {
//			contentsModel(i);			
//			try {
//				FileWriter file = new FileWriter("D:\\RTCScability\\RTC-"+i+".sysadl");
//				file.write("Model SysADLModel ; \n");
//				file.write(this.types);
//				file.write(this.ports);
//				file.write(this.connectors);
//				file.write(this.componentsImports);
//				file.write(this.ComponentDefRTCSystemCFD);
//				file.write(this.ComponentsRTCSystemCFD_Componet);
//				file.write(this.ComponentsRTCSystemCFD_Connectors);
//				file.write(this.finish);
//				file.write(this.ComponetDefRoomTemperatureControllerCP);
//				file.write(this.componetsDef);
//				file.write(this.behavior);
//				file.write(this.allocations);
//				
//				file.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
