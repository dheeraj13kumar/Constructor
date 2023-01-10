package pkg3;

public class Assignment
{
public int multi(int a, int b)
{
int c;
c=a*b;
System.out.println("multi result is " +c);
return c;
}
public int sum(int x, int y)
{
	int z;
	z=x+y;
	System.out.println("sum result is " +z);
	return z;
	}
public int multi2(int a1, int a2)
{
	int a3;
	a3=a1*a2;
	System.out.println("multi2 result is " +a3);
	return a3;
}
public int sub(int x1, int x2)
{
	int x3;
	x3=x1-x2;
	System.out.println("sub result is " +x3);
	return x3;
}
public void div(int y1, int y2)
{
	int y3;
	y3=y1/y2;
	System.out.println("Final result is " +y3);
	
}
 public static void main(String[] args)
 {
Assignment obj=new Assignment();
int multiResult=obj.multi(10, 2);
int sumResult=obj.sum(multiResult, 2);
int multi2Result=obj.multi2(sumResult, 2);
int subResult=obj.sub(multi2Result, 2);
obj.div(subResult, 2);



}
}
