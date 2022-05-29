package BroCodeJava;

import java.util.Scanner;

public class Example {
	
	public static void main(String[] args) {
		
		double x,y,z;
		
		Scanner scanner =new Scanner(System.in);//this is creating a object.....??
		//scanner takes user input
		
		System.out.println("enter side x:");
		//prints this
		x=scanner.nextDouble();
		//takes the user input and stores it in x
		System.out.println("enter side y:");
		y=scanner.nextDouble();
		
		z= Math.sqrt((x*x)+(y*y));
		//formula for square root
		
		System.out.println("the hypotenuse is"+z);
		//prints this
		scanner.close();
		//scanner is closed as we opened it in the beginning
	
		

	}

}
