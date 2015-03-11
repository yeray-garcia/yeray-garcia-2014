/**
 * 
 */
package org.cuatrovientos.channel;

import java.util.Vector;

/**
 * @author Yeray García
 *
 */
public class Channel {
private Vector <Program> programs = new Vector<Program>();


/**
 * Add program to the channel
 * @param program
 * @return 
 */
public  String addProgram (Program program) {
	String yesno = "yes";
	if (program.getStartHour() > program.getFinalHour()) {
		yesno = "no";
	}
	if (program.getStartHour() < 0 || program.getFinalHour() < 0 ) {
		yesno = "no";
	}
	if (program.getFinalHour() == program.getStartHour()) {
		yesno = "no";
	}
	for(int i = 0; i < programs.size(); i++) {
		if (program.getFinalHour() < programs.elementAt(i).getFinalHour()) {
			yesno = "no";
			
		}
		
		if (program.getFinalHour() > programs.elementAt(i).getFinalHour() && program.getStartHour() < programs.elementAt(i).getStartHour()) {
			yesno = "no";
		}
		
		
		
		if (program.getFinalHour() == programs.elementAt(i).getFinalHour()|| program.getStartHour() == programs.elementAt(i).getStartHour()) {
			yesno = "no";
		}
		
		
	
         } 
	  if (yesno == "yes") {
		  programs.addElement(program);
		  
	  }
	  
	return yesno;
	
	

	
}
/**
 * Removes a program to the channel
 * @param program
 * @return yesno
 */
  public String removeProgram (String name, int start, int f) {
	  String yesno = "no";
	  if (programs.contains(new Program(name,start,f))) {
		  yesno = "yes";
	  }
	  return yesno;
		 
	 }
	  
  
  /**
   * Shows all programs
   * @return
   */
 public String showAll () {
	 String myString = "";
	 for (int i = 0; i < programs.size(); i++) {
		myString = myString + programs.elementAt(i).toString() + "\n";	
		}
	 return myString;
 }
 /**
  * Checks programs in determinated hours
  * @param a
  * @param b
  * @return
  */
 public String checkProgram (int a, int b) {
	 String myString = "There aren't any programs";
	 for(int i = 0; i < programs.size(); i++) {
		 if (programs.elementAt(i).getFinalHour() >= b ) {
			 myString = programs.elementAt(i).toString() + "\n";	 
		 }
		 
	 }
	 
	 return myString;
 }
}
