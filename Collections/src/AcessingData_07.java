import java.util.ArrayList;

public class AcessingData_07 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(400);
		
		System.out.println(a1);
		
//		double d = (double)a1.get(2);	// downcaste to double as get has object
//		
//		System.out.println(d);
		
//		for(int i = 0;i < a1.size(); i++) {
//			
//			System.out.println(a1.get(i));
//		}
		
//		for( Object o : a1) {
//			
//			System.out.println(o);
//		}
		
		for(int i = 0;i < a1.size(); i++) {
			
			Integer data = (Integer) a1.get(i);
			
			System.out.println(data); 	// causes infinite loop till memory full
			a1.add(44);	// dynamically increasing size of list.
		}
		
	}

}
