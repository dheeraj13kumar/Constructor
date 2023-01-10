package pkg3;

public class Constructor 
{
	public Constructor()
	{
		this(2, 3, 4, 5);	
	System.out.println("Default Constructor");
	}
	public Constructor(int a)
	{
		this();
		System.out.println("one parameterized constructor");
	}
	public Constructor(int a, int b)
	{
		this(354);
		System.out.println("two parameterized constructor");
	}
	public Constructor(int a, int b, int c)
	{
		this(35, 45);
		System.out.println("three parameterized constructor");
		}
	public Constructor(int a, int b, int c, int d)
	{
		System.out.println("four parameterized constructor");
		}
	public static void main(String[] args) 
	{
		Constructor s=new Constructor(33, 44, 55);
	}
}
