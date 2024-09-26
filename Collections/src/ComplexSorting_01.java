import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
	
	int age;
	String name;
	double avg;
	
	public Cricketer(int age, String name, double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}
	
}

//class Abc implements Comparator<Cricketer>{	//method 1
//
//	@Override
//	public int compare(Cricketer o1, Cricketer o2) {
//		
//		if(o1.avg > o2.avg)
//		
//			return 1;
//		else 
//			return -1;
//	}
//	
//	
//}

public class ComplexSorting_01 {

	public static void main(String[] args) {
			
		Cricketer c1 = new Cricketer(35, "Virat", 89);
		Cricketer c2 = new Cricketer(38, "Dhoni", 79);
		Cricketer c3 = new Cricketer(36, "Rohit", 78);
		
		ArrayList<Cricketer> al = new ArrayList<>();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		System.out.println(al);
		
		//Collections.sort(al);	// ce
		
		//Abc a = new Abc();	// method 1
		
//		Comparator<Cricketer> c =new Comparator<Cricketer>(){	// method 2
//
//			@Override
//			public int compare(Cricketer o1, Cricketer o2) {
//				
//				if(o1.avg > o2.avg)
//				
//					return 1;
//				else 
//					return -1;
//			}
//		};
		
		Comparator<Cricketer> c = (Cricketer o1, Cricketer o2) -> {	// method 3 lambda expression
				
			if(o1.avg > o2.avg)
				
				return 1;
			else 
				return -1;
		};
		
		Collections.sort(al, c);
		
		System.out.println(al);
		
		 
		
	}

}
