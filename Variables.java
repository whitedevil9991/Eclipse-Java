package BroCodeJava;
//program to swap two variables
public class Variables {
	public static void main(String [] args) {
		
		String x="Water";
		// here x is a variable and water is a string value assigned to it
		String y="Kool-Aid";
		//here y is a veriable and kool aid is a string value assigned to it
		String temp;
		//temp is the third variable to store the variable when we swap the variables
		
		
		temp=x;
		//storing x value in temp
		x=y;
		//storing x value in y
		y=temp;
		//storing y value in temp
		
		System.out.println("x");
		//stnd output 
		System.out.println("y");
	}

}
