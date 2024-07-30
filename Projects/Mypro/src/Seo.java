import java.util.Scanner;
public class Seo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0, i=0,sumeven=0,sumodd=0;
	
		n=s.nextInt();
		
		while(i<=100)
		{
			if(i%2==0)
			
				sumeven+=n;
			System.out.println(sumeven);
			i++;
			
				
		}	
			
	}

}
