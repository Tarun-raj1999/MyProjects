package myNewPackage;

public class Reverse {

	String s="oranium";
	char ch;
	String temp=" ";
	public void reverse() {

	for(int i=0;i<s.length();i++)
	{
		ch=s.charAt(i);
		temp=ch+temp;
		
	}
		System.out.println(temp);
	}
 
	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.reverse();

	}

}