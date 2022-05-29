package Exception;

public class ExcepionTest {
	
	/*
	 * Checked : exception which has high probablity of occurance
	 * Handled @ compiled time only
	 * Those exception comes under exception class heirarcy known as Checked exception
	 * 
	 * Unchecked : which has low probability
	 * handled @ runtime only
	 * all the exception which are comes under RunTimeException class are treated as unchecked exception
	 * 
	 */
	
	/*
	 * try.catch,finally,throw,throws
	 */
	
	//this is the main method
	public static void main(String[] a)
	{
		
		//try and catch are used to handle the exception in the same class
		try
		{
			int data =100/0;
			System.out.println(data);
		
		}
		
		catch(RunTimeException e)
		{
		   e.printStackTrace();	
		}
		
		
		/*int data =100/0;
		--declaration
		System.out.println(data);
		--printing output*/
	}

}
