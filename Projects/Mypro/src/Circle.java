import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double PI=3.14;
		System.out.println("enter the radius value");
		int Radius=s.nextInt();
		double Circle =PI*Radius*Radius;
		System.out.println("The area of a circle ="+Circle);
	}

}
