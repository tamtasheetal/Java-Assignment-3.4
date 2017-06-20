package StudentInfo;

//Here class StudentResultProcesing is extending class EncapTest2

import java.util.Scanner;

class StudentResultProcesing extends EncapTest2 
{
public static void main(String []args) 
{
EncapTest2 EncapTest_new=new EncapTest2();

StudentResultProcesing srp=new StudentResultProcesing();

Scanner sc = new Scanner(System.in);

	System.out.println("Enter your name :");
	sc.next();
	
	
	System.out.println("Enter your phone number :");
	sc.next();
	
	
	System.out.println("Enter your Class :");
	sc.next();
	
	
	System.out.println("Enter your Roll number :");
	sc.nextInt();
	{

System.out.println("Please enter marks in Physics");

float phy = sc.nextInt();

System.out.println("Please enter marks in Chemistry");

float chem = sc.nextInt();

System.out.println("Please enter marks in Math");

float math = sc.nextInt();

float final_result=EncapTest_new.getResult(phy,chem,math);

srp.getResult(phy,chem,math);

System.out.println("Average of student is " + final_result );

if ( final_result > 35 )

{

System.out.println("Pass" );

}
else

{	
	System.out.println("Fail" );

}
}

}
}
