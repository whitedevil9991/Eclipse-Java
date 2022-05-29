package BroCodeJava;

import java.util.Random;

//this is the creation of class
public class RandomNumbers {
	
	//void = is the return type
	//public = access modifier
	/* this is the main method and the execution
	 *  starts from here */
	public static void main(String[] args) {
	/*An object belonging to a particular class, such as in Java,
	may also be described as an instance.*/
	
		Random Random =new Random();
		Random Random1 =new Random();
		
		Random Random2 =new Random();
		//this is creating instance
		//gives us access to random instance
		//instance = object, they are the same things
		
		int x=Random.nextInt(6);
		//this creates a random integer value and assigns it to 'x'
		//nextInt(6), the 6 is the limit of the random numbers
		
		double y=Random.nextDouble();
		boolean z= Random.nextBoolean();
		
		//how to print all three outputs ......??? 
		
		System.out.println(x);
		//prints the result
		System.out.println(y);
		System.out.println(z);
	}

}
