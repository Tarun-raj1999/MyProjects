import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
  		int n,i=1,sum=0;
  		while(i<=10)
  		{
  			System.out.println("Enter the num");
  			n=s.nextInt();
  			sum=sum+n;
  			i++;
  		}
  		System.out.println("result="+sum);
	}

}
