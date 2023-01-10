package pkg3;

public class Class2 extends Class1 
{
	public Class2()
	{
		this(35, 23, 34);		
	System.out.println("Child Default Constructor");
	}
	public Class2(int a)
	{
		this(35, 23);
		System.out.println("Child 1 parameterized constructor");
	}
	public Class2(int a, int b)
	{
		this();
		System.out.println("Child 2 parameterized constructor");
	}
	public Class2(int a, int b, int c)
	{
		super(22, 66, 12, 23);
		System.out.println("Child 3 parameterized constructor");
		}
	public Class2(int a, int b, int c, int d)
	{
		this(35);
		
		System.out.println("Child 4 parameterized constructor");
		}
	public static void main(String[] args) 
	{
		Class2 obj=new Class2(22, 82, 11, 1);
	}   
}