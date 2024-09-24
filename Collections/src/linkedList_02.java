
// LinkedList -> deque and list , duplicates allowed

import java.util.LinkedList;

public class linkedList_02 {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(10);
		l1.add("java");
		l1.add(true);
		l1.add(20);
		
		System.out.println(l1);
		
		l1.addFirst(30);
		l1.add(2, 44);
		
		System.out.println(l1);
		
		l1.offer("Devops");
		l1.offerFirst("junit");	// offer could be rejected if not enough memory.
		
		
		System.out.println(l1.peek());	// peek show the first element of the collection copies the first elemetn and print it
	
		System.out.println(l1.poll());	// removes the first element
		
		System.out.println(l1);
	
	}

}
