import java.util.ArrayList;
import java.util.Collections;

public class Collection_01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(45);
		list.add(20);
		list.add(34);
		list.add(78);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("************************************");
		
		ArrayList<String> list2 =new ArrayList<>();
		
		list2.add("Java");
		list2.add("Spring");
		list2.add("DevOps");
		list2.add("Junit");
		
		System.out.println(list2);
		
		Collections.sort(list2);
		
		System.out.println(list2);
		
	}

}
