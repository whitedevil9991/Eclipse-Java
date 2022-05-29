package BroCodeJava;

import java.util.Scanner;
//importing the scanner method .......???

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		//this  is to take input from the user
		 
		System.out.println("what is your name?");
		//this is show the user to give an input
		
		String name = scanner.nextLine();
		/*assign your input to the scanner, the nextLine is a method of 
		java which takes input even after spaces*/
		
		//where as next() only takes input until the space, after that it doesn't take any input
		
		System.out.println("what is your age?");
		int age= scanner.nextInt();
		//nextInt takes only a whole integer as an input from the user.
		
		scanner.nextLine();
		
		System.out.println("What is your favorite food?");
		String food= scanner.nextLine();
		
		System.out.println("Hello"+name);
		System.out.println("You are:"+age+"Years Old");
		System.out.println("You like"+food);
		//these give the output of the input you gave
	}
}
