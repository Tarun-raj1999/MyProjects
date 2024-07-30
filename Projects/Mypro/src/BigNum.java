import java.util.Scanner;
public class BigNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number n1=");
		int n1=s.nextInt();
		System.out.println("Enter the number n2=");

		int n2=s.nextInt();
		System.out.println("Enter the number n3=");
		int n3=s.nextInt();
		if(n1>n2 && n1>n3)
			System.out.println("n1 is the gratest number");
		else
			if(n2>n1 &&n2>n3)
				System.out.println("n2 is the greatest number");
			else
					System.out.println("n3 is the greatest number");
	}

}
