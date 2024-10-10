import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LaunchStream {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(50);
		list.add(12);
		list.add(49);
		list.add(14);
		list.add(56);
		
		System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println(list);
		
//		Stream<Integer> StreamData1 = list.stream();	// stream bits created
//		Stream<Integer> sortedStream = StreamData1.sorted();	// for every stream 1 operation work only 
//										
//		Stream<Integer> StreamData3 = sortedStream.map(n -> n*2);	
//		
//		StreamData3.forEach((n)-> System.out.println(n));
		
//		Stream<Integer> StreamData2 = StreamData1.map(n ->n * 2);		
//		StreamData2.forEach((n)-> System.out.println(n));
		
		
//		list.stream()	// // method chaining can be done in stream
//		.sorted()
//		.map(n->n*2)
//		.forEach((n) -> System.out.println(n));
//		
//		String n = "JAVA";
//		
//		int length = n.toUpperCase()
//					.toLowerCase()
//					.concat("Spring")
//					.length();
		
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("spring");
		list2.add("jdbc");
		list2.add("servelet");
		list2.add("java");
		
		Set<String> set = list2.stream().collect(Collectors.toSet());
		
		List<String> list3 = list2.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list3);
		
		list2.
	}

}
