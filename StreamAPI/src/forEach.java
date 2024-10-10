import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class forEach {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(12);
		list.add(19);
		list.add(54);
		list.add(66);
		
		System.out.println(list);
		
//		for(Integer i : list) {
//			
//			int result = i * 2;
//			System.out.println(result);
//		}
//		
//		System.out.println(list);
		
//		Consumer<Integer> consumer = new Consumer<>() {	// Anonymous class
//			
//			@Override
//			public void accept(Integer n) {
//				
//				System.out.println(n);
//			}
//		};
//		
//		list.forEach(consumer);
		
		// lambda expression
		
//		Consumer<Integer> consumer = (Integer n) -> System.out.println(n);
		
		// ideal way
		
		list.forEach((n) -> System.out.println(n));
		
	}

}
