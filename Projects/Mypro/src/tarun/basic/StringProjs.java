package tarun.basic;

public class StringProjs {

	String str="this is java"; String s="";
 char c;
	public void stringProj1()
	{for(int i=0;i<=str.length();i++)
	{
		c=str.charAt(i);
		s=c+s;
		System.out.println(s);
	}
		
	}
	
	public static void main(String[] args) {
		StringProjs obj1=new StringProjs();
		obj1.stringProj1();
        
	}

}