import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age =s.nextInt();
		if(age>=18)	
			System.out.println("You are major");
		else
			if(age==0)
				System.out.println("Invalid Input");
		else
			if(age<=18)
				System.out.println("you are minor");
	}

}
