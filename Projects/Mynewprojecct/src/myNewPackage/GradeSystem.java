package myNewPackage;

public class GradeSystem {
 int marks=50;
	
	public void grade()
	{
		if(marks<=100 && marks>=0)
		{
			 if (marks>=90 && marks<=100){
				System.out.println("A grade");
				
			}
			 else if( marks<90 && marks>=70)
			 {
				System.out.println("B grade"); 
			 }
			 else if(marks<70 && marks>=50 )
			 {
				 System.out.println("c grade");
			 }
			 else if(marks<50 && marks>=30)
			 {
				 System.out.println("D grade");
			 }
			 else if( marks<30 && marks>0)
			 {
				 System.out.println("F grade");
			 }
		}
		else {
			System.out.println("enter a valid marks");
		}
		
		
	}
	
	public static void main(String[] args) {
	  
		GradeSystem f=new GradeSystem();
		f.grade();
		
	}

}
