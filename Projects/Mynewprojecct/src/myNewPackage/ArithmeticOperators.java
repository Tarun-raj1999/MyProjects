package myNewPackage;

public class ArithmeticOperators {
int a=10;
int b=20;
int c;
	public void add()
	{
		 c=a+b;
		 System.out.println(c);
	}
	public void sub()
	{
		c=a-b;
		 System.out.println(c);
	}
	public void div()
	{
		c=a/b;
		 System.out.println(c);
	}
	public void mul()
	{
		int c=a*b;
		 System.out.println(c);
	}
	public void mod()
	{
		int c=a%b;
		 System.out.println(c);
	}
	public static void main(String[] args) {
		ArithmeticOperators obj1=new ArithmeticOperators();
		obj1.add();
		obj1.sub();
		obj1.div();
		obj1.mul();
		obj1.mod();
		
		
	
	}

}
