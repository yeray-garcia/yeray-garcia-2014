/**
 * 
 */
package org.cuatrovientos.channel;

import java.util.Scanner;

/**
 * @author Yeray
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String option = "";
		String line = "";
		Scanner reader = new Scanner(System.in);
		Channel myChannel = new Channel();
do {
			
			System.out.println("Select an option");
			System.out.println("1.Add program");
			System.out.println("2.Remove program");
			System.out.println("3.Show all programs");
			System.out.println("4.Check programas in determinated hours");
			System.out.println("5. Exit");
			option = reader.nextLine();
			
			switch (option) {
			case "1":
				String yesno = "";
				do {
				String name = "";
				System.out.println("Add a new Program");
				System.out.println("Program name");
				name = reader.nextLine();
				System.out.println("Start hour");
				int start = Integer.parseInt(reader.nextLine());
				System.out.println("Final hour");
				int fin = Integer.parseInt(reader.nextLine());
				yesno = myChannel.addProgram(new Program(name,start,fin));
				if (yesno == "no") {
					System.out.println("Error with the program hours");
				}
				} while(!yesno.equals("yes"));
				
				
				
				break;
				
			case "2":
				String sn = "";
				do {
				String n = "";
				System.out.println("Remove  Program");
				System.out.println("Program name");
				n = reader.nextLine();
				System.out.println("Start hour");
				int s = Integer.parseInt(reader.nextLine());
				System.out.println("Final hour");
				int f = Integer.parseInt(reader.nextLine());
				sn = myChannel.removeProgram(n, s, f);
				if (sn == "no") {
					System.out.println("Error the program doesn't exist");
				}
				} while(!sn.equals("yes"));
				
				
				break;
			
			
			case "3":
				System.out.println(myChannel.showAll());
				
				
				break;
				
			case "4" :
				System.out.println("Entry first hour");
				int first = Integer.parseInt(reader.nextLine());
				System.out.println("Entry second hour");
				int second = Integer.parseInt(reader.nextLine());
				System.out.println(myChannel.checkProgram(first, second));
				
						
				break;
			
			case "5" :
				System.out.println("GoodBye");
				break;
			default :
				System.out.println("Incorrect option");
				break;
			}
				
				
			
		} while (!option.equals("5"));
	}

}
