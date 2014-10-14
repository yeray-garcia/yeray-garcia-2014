package org.cuatrovientos.controlexercise8;

import java.util.Scanner;

public class ControlExercise8 {

	private static final float DOLAR_CHANGE = 1.58f;
	private static final float YEN_CHANGE = 135.89f;
	private static final float POUND_CHANGE = 0.79f;

	public static void main(String[] args) {
		float number = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		String line1="";
		System.out.println("Enter the number of euros");
		line = reader.nextLine();
		number =Float.parseFloat(line);
		System.out.println("¿Dolar, yen or libra <d/y/l>?");
		line1= reader.nextLine();
		switch (line1) {
		case("d"):
			System.out.println("The number of dolar is " + number * DOLAR_CHANGE);
		break;
		case("y"): 
			System.out.println("The number of yen is "+ number * YEN_CHANGE);
		break;
		case("l"):
			
		System.out.println("The number of libra is " + number * POUND_CHANGE);  //MAGIC NUMBERS
		break;
		default:
			System.out.println("Currency not supported");
			
		
		
		
		
		
		}
		

	}

}
