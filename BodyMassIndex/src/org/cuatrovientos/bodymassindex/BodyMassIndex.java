package org.cuatrovientos.bodymassindex;

import java.util.Scanner;

/**
 * 
 * @author Yeray
 *Simple class to know what is the body mass index
 */
public class BodyMassIndex {

	public static void main(String[] args) {
		
			float peso = 0;
			float altura = 0;
			Scanner reader = new Scanner(System.in);
			String line = "";
			String line1="";
			System.out.println("Enter the weight");
			line = reader.nextLine();
			peso =Float.parseFloat(line);
			System.out.println("Enter the height");
			line1 = reader.nextLine();
			altura =Float.parseFloat(line1);
			float result = (peso/(altura*altura));
			System.out.println("Your imc is "+ result);
			if (result < 16) {
				System.out.println("Hay que comer mas");
			}
			else if (result >= 16 && result <25 ) {
				System.out.println("Estás bien");
				
			}
			else if (result > 25 && result < 30) { System.out.println("Cuídate un poco");
			
			}
			
			else if (result > 30) {
				System.out.println("Vete al hospital");
			}
			
			
			
			

	}

}
