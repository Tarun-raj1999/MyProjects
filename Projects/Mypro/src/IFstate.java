import java.util.Scanner;
public class IFstate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the itemnum=");

		int itemnum=s.nextInt();
		System.out.println("Enter the name=");
		String name=s.next();
		System.out.println("Enter the rate=");
		double rate=s.nextDouble();
		System.out.println("Enter the quantity=");
		double quantity=s.nextDouble();
		double price=(rate*quantity);
		System.out.println("the value of the price ="+price);
		System.out.println("Enter the n value=");
		int n=s.nextInt();
		double disc = n/100*price;
		System.out.println("the disc value="+disc);
		double netprice=price-disc;
		System.out.println("the netprice value="+netprice);
		if(price>=1000 && price<2000)
		  System.out.println(disc);
		
		else
		if (price>=2000 && price<3000)
			System.out.println(disc);
			else
		if (price>=3000 && price<5000)
			System.out.println(disc);
			else
		if (price >=5000)
			System.out.println(disc);
			
		System.out.println("The itemnum is="+itemnum);
		System.out.println("the name ="+name);
	
		System.out.println("the discount="+disc);
		System.out.println("the netprice="+netprice);
		
			
	}

}
