import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class checkFailSafe_09 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList a = new CopyOnWriteArrayList();
		
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		
		System.out.println(a);
		
//		Iterator itr = a.iterator();
//		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//			
//			a.add(44);
//		}
		
//		ListIterator litr = a.ListIterator();
//		
//		while(litr.hasNext()) {
//			
//			System.out.println(litr.next());
//		}
		
		ListIterator litr = a.listIterator(a.size());	// reverse list
		while(litr.hasPrevious()) {
			
			System.out.println(litr.previous());
		}
	}	

}
