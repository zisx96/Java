import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>{
	
	int age;
	String name;
	double avg;
	
	public Cricketer1(int age, String name, double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Cricketer1 [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}
	@Override
	public int compareTo(Cricketer1 o) {
		
		if(this.avg > o.avg)
			return 1;
		else
			return -1;
	}
	
}

public class ComplexSorting_02 {

	public static void main(String[] args) {
		
		Cricketer1 c1 = new Cricketer1(35, "Virat", 89);
		Cricketer1 c2 = new Cricketer1(38, "Dhoni", 79);
		Cricketer1 c3 = new Cricketer1(36, "Rohit", 78);
		
		ArrayList<Cricketer1> al = new ArrayList<>();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		System.out.println(al);
		Collections.sort(al);
		
		System.out.println(al);

	}

}
