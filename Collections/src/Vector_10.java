import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_10 {

	public static void main(String[] args) {
			
		Vector v = new Vector();
		v.addElement(100);
		v.add(200);
		v.add(300);
		v.addElement(400);
		
		System.out.println(v);
		
		
		 Iterator itr = v.iterator();
		 
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next());
		 }
		 
		 Enumeration en = v.elements();
		 while(en.hasMoreElements()) {
			 
			 System.out.println(en.nextElement());
		 }
	}

}
