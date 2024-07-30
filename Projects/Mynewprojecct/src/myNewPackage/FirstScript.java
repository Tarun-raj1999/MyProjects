package myNewPackage;

public class FirstScript {

int a=10;

public void number()
{
System.out.println(a);	
}
public void localVariable()
{
	int b=20;
	
	System.out.println(b);
}


public static void main(String args[])
{
	
	FirstScript f=new FirstScript();
	f.number();
	f.localVariable();
	System.out.println("the value of the variable a"+f.a);
	
}

}
