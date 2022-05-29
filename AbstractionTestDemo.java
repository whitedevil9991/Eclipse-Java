package abstraction;

import InterfaceTest.Car;

/*
 * ABSTRACTION :
 * 
 * 1.Interface --- 100% abstraction
 *  A component which contains only abstract method.
 *  
 *  abstract method:A method which doesn't have any method body
 * 
 * 2.Abstraction ---partial abstraction
 * 
 * 3.
 */

public class AbstractionTestDemo 
{
	public static void main(String[] a)
	{
		Car c=new Company();
		c.Drive();
		c.ignition();
		c.Music();
		c.servicing();
		c.transport();
	}

}
