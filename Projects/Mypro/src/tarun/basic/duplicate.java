package tarun.basic;

public class duplicate {

	public static void main(String[] args) {
	 int a[]= {1,2,3,2,2,2};
	int count=0;
	
	 for(int i=0;i<a.length;i++)//2
	 { 
		
	
		 for(int j=i+1;j<a.length;j++)//3
		 { 
			
			 if(a[i]==a[j])
			 {
				System.out.print(a[j]);
		      count++;
		        }
			 else
			 {
				 break;
			 }
		
		
			
		
			 
		 }
		 
		
		
		
		
		
	 }
	 System.out.print(count);
	
	 
	}

}
