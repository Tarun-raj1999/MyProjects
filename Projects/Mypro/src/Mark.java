import java.util.Scanner;
public class Mark {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rollnum");
		int Rollnum=s.nextInt();
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the marks");
		double mark1=s.nextDouble();
		double mark2=s.nextDouble();
		double mark3=s.nextDouble();
		double total=mark1+mark2+mark3;
		System.out.println("The total marks="+total);
		double avg=total/3;
		System.out.println("the total avg="+avg);
	}

}
