package myNewPackage;
import java.util.Arrays;
import java.util.Vector;
/**
 * 
 */
public class Vpractice1 {

	
	public static void main(String[] args) {
	  Vector v1=new Vector();
	  v1.add("jeevan");
	  v1.add("raj");
	  v1.add(0,"jailer");
	  
	  Vector v2= new Vector();
	  v2.add("ramesh");
	  v2.add("suresh");
	v1.addAll(0,v2);
v1.remove("raj");
	
v1.removeAll(v2);
v1.clear();
v1.add("kajal");
  Vector v3 =new Vector();
  v3.add("suresh");
  v3.add("ramesh");



		Object[] arr=v2.toArray();
		System.out.println(Arrays.toString(arr));
		

	}

}
