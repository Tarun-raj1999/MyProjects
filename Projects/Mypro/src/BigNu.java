import java.util.Scanner;
public class BigNu {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int big =(a>b)&&(a>c)?a:((b>c)? b : c);
	System.out.println("the biggest is"+big);
	}

}
