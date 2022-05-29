package BroCodeJava;

import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		
		//switch =statement that allows a variable to be tested for equality against a list of values
		Scanner Scanner= new Scanner(System.in);
		System.out.println("enter a day of the week");
		
		
		
		switch(day) {
		case "sunday":System.out.println("it's sunday !");
		break;
		case "monday":System.out.println("it's monday !");
		break;
		case "tuesday":System.out.println("it's tuesday !");
		break;
		case "wednesday":System.out.println("it's wednesday !");
		break;
		case "thursday":System.out.println("it's thursday !");
		break;
		case "friday":System.out.println("it's friday !");
		break;
		case "saturday":System.out.println("it's saturday !");
		break;
		default: System.out.println("invalid input");
		}
			
	}
	
}
