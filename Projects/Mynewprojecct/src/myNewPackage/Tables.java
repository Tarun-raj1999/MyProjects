package myNewPackage;

public class Tables {

	public void tab()
	{
		
	int a=5;
	int temp=0;
		for(int i=1;i<=10;i++)
		{
			temp=a*i;
			System.out.println(a+"*"+i +"="+ temp);
		}
		
	}
	public static void main(String[] args) {
	     
	       Tables t= new Tables();
	       
	       t.tab();

	}

}
