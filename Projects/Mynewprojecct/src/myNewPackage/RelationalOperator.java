package myNewPackage;

public class RelationalOperator {
	
	
	

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//RelationalOperator
		System.out.println("---Relational Operator---");
		System.out.print(a>b);
		System.out.print(" ");
		System.out.print(a<b);
		System.out.print(" ");
		System.out.print(a<=b);
		System.out.print(" ");
		System.out.print(a>=b);
		System.out.print(" ");
		System.out.print(a!=b);
		System.out.print(" ");
		System.out.print(a==b);
		System.out.println(" ");
	
		
        //logicalOperator
		System.out.println("---Logical Operator----");
		System.out.print(a<=b && a!=b);
		System.out.print(" ");
		System.out.print(a>=b || a<b);
		System.out.print(" ");
		System.out.print(!(a<b));
		System.out.println(" ");
		
		//conditionalOperator
		System.out.println("---Conditional Operator---");
	 System.out.println((a!=b)?"A is not equal to b":"A is equal to b");
	 System.out.print(" ");
	 
	 //increDecre
	 System.out.println("---Incredecre---");
	 System.out.print(a++);
	 System.out.print(" ");
	 System.out.print(++a);
	 System.out.print(" ");
	 System.out.print(b--);
	 System.out.print(" ");
	 System.out.print(--b);
	 System.out.print(" ");
	 System.out.println("");
	 
	 //concatenationOperator
	 System.out.println("---concatenationOperator--");
	 System.out.println("The A and b are not eqaual"+"hence it will return false");
	 
	 
	 
	 
	}

}
