package pkg3;

public class Class1 
 {
	public Class1()
	{
		this(35, 23, 89);	
	System.out.println("Parent Default Constructor");
	}
	public Class1(int a)
	{
		this();
		System.out.println("Parent 1 parameterized constructor");
	}
	public Class1(int a, int b)
	{
		this(7);
		System.out.println("Parent 2 parameterized constructor");
	}
	public Class1(int a, int b, int c)
	{
		
		System.out.println("Parent 3 parameterized constructor");
		}
	public Class1(int a, int b, int c, int d)
	{
		this(35, 23);
		System.out.println("Parent 4 parameterized constructor");
		}
	}