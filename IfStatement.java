package BroCodeJava;

public class IfStatement {
	
		public static void main() {
			// if statement = performs a block of code if it's condition evaluates to be true
			 int age =12;
			 if(age>=18) {
				 System.out.println("eligible for voting");
			 }
			 else if(age>=75) {
				 System.out.println("ok Boomer");
			 }
			 else if(age==0) {
				 System.out.println("");
			 }
			 else {
				 System.out.println("You are not eligible for voting");
			 }
		}
	}


