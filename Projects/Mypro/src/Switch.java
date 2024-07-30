import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int res=0;
		System.out.println("Enter the two numbers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("1 Add ");
		System.out.println("2 subtract");
		System.out.println("3 division");
		System.out.println("4 multiplication");
		int ch=s.nextInt();
		switch (ch)
		{
		case 1 : res=n1+n2;break;
		case 2 : res=n1-n2;break;
		case 3 : res=n1/n2;break;
		case 4 : res=n1*n2;break;
		default:System.out.println("invalid identifier");System.exit(1);
		
			}
 System.out.println("Result="+res);
	}
}
