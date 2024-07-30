import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int sum=0;
			System.out.println("Enter the size of the array");
			int size=s.nextInt();
			int[] n=new int[size];
			System.out.println("Enter"+size+"array");
			for(int i=0;i<n.length;i++)
			{
				n[i]=s.nextInt();
			sum=sum+n[i];
			}
			for(int i=0;i<n.length;i++)
				System.out.println(n[i]);
			System.out.println(sum);

	}
}
