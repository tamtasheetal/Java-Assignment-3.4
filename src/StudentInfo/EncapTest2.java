package StudentInfo;

class EncapTest2 
{
private String name;
private String phone;
private String rollnumber;
private String classname;

//This is a getter method for name
	public String getName() 
	{
		return this.name;
	}
	
	//This is a getter method for phone number
	public String getPhone() 
	{
		return this.phone;
	}
	
	//This is a getter method for rollNo
	public String getrollnumber() 
	{
		return this.rollnumber;
	}
	
	//This is a getter method for class name
	public String getClassname() 
	{
		return  this.classname; 
	}
	
	//This is a setter method for phone number
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//This is a setter method for name
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//This is a setter method for class
	public void setClassname(String classname) 
	{
		this.classname = classname;
	}
	
	//This is a setter method for rollNo.
	public void setRollnumber(String rollnumber) 
	{
		this.rollnumber = rollnumber;
	}

public float getResult(float a,float b,float c)
{
return (a+b+c)/3;
}

public float getResult1(float phy, float chem, float math) 
{
	return 0;
}
	
	public void displayResult () 
	{
		System.out.println("The result for this student is : ");
		System.out.println("Name : "+this.getName());
		System.out.println("Phone : "+this.getPhone());
		System.out.println("Class : "+this.getClassname());
		System.out.println("Roll No : "+this.getrollnumber());
	
	}

}
