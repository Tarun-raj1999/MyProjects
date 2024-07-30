import java.util.Scanner;
public class Rec {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter lenth value:");
		int length=s.nextInt();
		System.out.println("enter breadth value:");
		int bredth=s.nextInt();
		
		int area=length*bredth;
		System.out.println("Enter the area "+area);
		System.out.println(area);

	}

}
