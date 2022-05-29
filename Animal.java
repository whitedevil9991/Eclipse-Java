package DemoInheritance;
public class Animal 
{
	private String food_type;
	private int no_of_legs;
	private String type;
	
	
	public Animal()
	//this is a default constructor
	{
		food_type="Carnivore";
		no_of_legs=2;
		type="mammal";
	}
	public Animal(String a,int b,String c)
	{
		//this is a constructor with parameters
		food_type=a;
		no_of_legs=b;
		type=c;
	}
	public static void main(String[] args)
	{
		//this is the main method
		return("food type"+food_type+"no of legs"+no_of_legs);
	}

}
