package Oranium.basic;

public class project2 {

	String str="this is java"; String s="";
	char ch;
	public void project()
	{
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			s=ch+s;
			
			
		}
		System.out.println(s);
	}
	
	public void project2()
	{
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			
			
		}
		
		
	}
	public static void main(String[] args) {
		
		project2  obj1=new project2 ();
		obj1.project();
		obj1.project2();
				

	}

}
