import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("To check the balance");
		int bal,ch,amt;
		  bal = s.nextInt();
		 do
		 {
			System.out.println("1 to depoite ");
			System.out.println("2 to withdrawl");
			System.out.println("3 to check the balance");
			System.out.println("4 Exit");
			System.out.println("Enter your choice");
			ch=s.nextInt();
			
			
			switch(ch)
			{
			case 1:System.out.println("enter the amount to be deposit");
			  amt =s.nextInt();
			  bal=amt+bal;
			  System.out.println("Your total balance="+bal);break;
			  
			case 2:System.out.println("Enter the amount to be withdraw");
			amt=s.nextInt();
			if(amt>bal)
				System.out.println("insufficient balance");
			else
				bal=bal-amt;
			case 3: System.out.println("To check the balance"+bal);break;
			default:System.out.println("Invalid choice");
			
			}
		 }while (ch!=4);
	}	
}