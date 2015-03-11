/**
 * 
 */
package org.cuatrovientos.channel;

/**
 * @author Yeray García
 *
 */
public class Program {
  private String name;
  private int startHour;
  private int finalHour;
  /**
   * Default constructor
   * @param name
   * @param startHour
   * @param finalHour
   */
public Program(String name, int startHour, int finalHour) {
	super();
	this.name = name;
	this.startHour = startHour;
	this.finalHour = finalHour;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStartHour() {
	return startHour;
}
public void setStartHour(int startHour) {
	this.startHour = startHour;
}
public int getFinalHour() {
	return finalHour;
}
public void setFinalHour(int finalHour) {
	this.finalHour = finalHour;
}
@Override
public String toString() {
	return "Progam [name=" + name + ", startHour=" + startHour + ", finalHour="
			+ finalHour + "]";
}

  
}
