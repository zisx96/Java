import java.util.ArrayList;
import java.util.List;

class Human{
	
	int age;
	
	public void disp() {
		
		System.out.println("this is human class");
	}
}

class Student extends Human{
	
	
}

class Employee{
	
	
}

public class generic_03 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		String s = new String("java");
		
		//obj = s;
		//s = obj;	// error or down-casting
		
		Human h = new Human();
		
		Student st = new Student();
		
		h =  st;
		
		// st = h; // error or down-casting '
		
		//ArrayList<Human> hlist = new ArrayList<>();
//		ArrayList<Student> slist = new ArrayList<>();
		
		// hlist = slistl; // compile error
		
//		ArrayList<?> hlist = new ArrayList<>(); // unknown 
		
//		hlist = slist;
//		
//		ArrayList<? extends Human> hlist1 = new ArrayList<>(); // upperbound, either human or child of human class
//		ArrayList<Student> slist1 = new ArrayList<>();
//		
//		ArrayList<Employee> elist = new ArrayList<>();
//		
//		ArrayList<Object> olist = new ArrayList<>();
//		
//		hlist1 = elist; //ce
//		
//		hlist1 = slist1;
		
		// hlist1 = olist; //ce
		
//		ArrayList<? super Human> hlist3 = new ArrayList<>(); // lowerbound
//		ArrayList<Student> slist3 = new ArrayList<>();
//		ArrayList<Employee> elist3 = new ArrayList<>();
//		ArrayList<Object> olist3 = new ArrayList<>();
//		
//		elist3 = hlist3; // no link ce
//		
//		hlist3 = slist3; // ce
//		
//		hlist3 = olist3; // parent of human Object class
	
//		ArrayList<Human> hlist = new ArrayList<Human>();
//		hlist.add(new Human());
//		hlist.add(new Human());
//		hlist.add(Human());
//		invokeDisp(hlist);
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student());
		slist.add(new Student());
		slist.add(new Student());
	//	invokeDisp(slist);
	}
	
//	public static void invokeDisp(List<? extends Human> list) {\
	
	public static void invokeDisp(List<Human> list) {
		
		for(Human h : list) {
			
			System.out.println(h);
		}
	}

}
