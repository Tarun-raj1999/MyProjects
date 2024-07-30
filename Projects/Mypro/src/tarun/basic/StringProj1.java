package tarun.basic;

public class StringProj1 {

	String str="this is java"; String s="";
	char c;
	public void projStr(){
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			s=s+c;
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StringProj1 obj1=new StringProj1();
		obj1. projStr();

	}

}
