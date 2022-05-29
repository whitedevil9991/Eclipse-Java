package encapsulation;

public class Student 
{
	/*
	 * Encapsulation :
	 * 1.declare the variable of class as private.
	 * 2. provide getter & setter method to modify & view the variable values
	 * 
	 */
	
	
	/*hiding*/
	private int id;
	private int rollNo;
	private String FirstName;
	private String LastName;
	private String address;
	private String department;
	private int age;
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo()
	{
		return 6+this.rollNo;
		/* "6+" this is modifying */
	}
	public void setRollno(int rollNo)
	{
		this.rollNo=rollNo;
	}
}
