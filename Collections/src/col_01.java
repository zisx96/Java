
// ArrayList -> hetro-genous data, takes object, list. duplicates allowed

import java.util.ArrayList;

public class col_01 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add("add");
		al.add(true);
		
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		
		al2.add(10);
		al2.add(20);
		al2.add(0, 30 );
		al2.addAll(al);
		
		System.out.println(al2.containsAll(al));
		
	}

}
