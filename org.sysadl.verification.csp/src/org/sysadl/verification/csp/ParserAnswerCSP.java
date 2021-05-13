package org.sysadl.verification.csp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserAnswerCSP {
	public static final String PARSE_STRING = 	"Counterexample type: divergence\r\n" + 
												"Children:\r\n" + 
												"  behaviour type: loops after index 1\r\n" + 
												"    Trace: FahrenheitToCelsiusEQ_f_FahrenheitTemperature.0, ?, \r\n" + 
												"    States: FahrenheitToCelsiusEQ_check, DIV, DIV,";
	public HashMap<String,String> trace = new HashMap<String, String>();
	public String assertion = "";
	
	public String getTrace(String answer, String assertion) {
		if (assertion.contains(":")) 
			this.assertion = (String) assertion.subSequence(0, assertion.indexOf(":"));
		else if(assertion.contains("[T="))
			this.assertion = (String) assertion.subSequence(0, assertion.indexOf("[T="));
		
		Pattern pattern = Pattern.compile("[Tt]race.*");
		Matcher matcher = pattern.matcher(PARSE_STRING);				
		String mach = "";			
		while(matcher.find()) {
            mach = matcher.group();
            getStepsFromTrace(mach);
		}
				
		return null;
	}

	private boolean getStepsFromTrace(String trace) {		
		String aux[] = trace.split(",");
		for (int i = 0; i < aux.length-1; i++) {
			if (aux[i].contains("?")) {				
				this.trace.put("?", "DIV");
			}
			else {
				if (aux[i].contains("Trace:")) {
					aux[i] = aux[i].replace("Trace:", "");
					aux[i] = aux[i].trim(); 
				}
				this.trace.put(aux[i].substring(0, aux[i].indexOf(".")), (String) aux[i].subSequence(aux[i].indexOf(".")+1, aux[i].length()));
			}
			
		}
		
		return true;
	}
}
