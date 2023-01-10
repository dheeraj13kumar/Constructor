package pkg3;

public class Automation 
{
public  void Method()
{
	this.Method3();
	System.out.println("default method");
	
}
public  void Method1()
{
	this.Method();
	System.out.println("one parameterized method");
	
}
public  void Method2()
{
	this.Method4();
	System.out.println("two parameterized method");
	}
public  void Method3()
{
	System.out.println("three parameterized method");
}
public  void Method4()
{
	this.Method1();
	System.out.println("four parameterized method");
}
public static void main(String[] args) 
{
	Automation obj=new Automation();
	obj.Method2();
	
	
}
}
