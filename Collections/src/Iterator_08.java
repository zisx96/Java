import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_08 {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		
		System.out.println(a);
		
		Iterator itr = a.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			a.add(44);
		}
	}

}
