package org.cuatrovientos.controlexercise8;

import java.util.Scanner;

public class ControlExercise8 {

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
			System.out.println("The number of dolar is " + number * 1.58);
		break;
		case("y"): 
			System.out.println("The number of yen is "+ number/0.0063);
		break;
		case("l"):
			
		System.out.println("The number of libra is " + number/ 1.27307);
		break;
		
		
		
		
		
		
		}
		

	}

}
