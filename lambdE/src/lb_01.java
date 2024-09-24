

//class Person{
//
//public void showName() {
//	
//	System.out.println("Yash");
//}
//
//class Phone{
//	
//	public void details() {
//		
//		System.out.println("OnePlus ");
//	}
//}
//}


class Alpha{
	
	public void show() {
		
		System.out.println("In alpha ");
	}
	
	public void display() {
		
		System.out.println("in display");
	}
}

class Beta extends Alpha{
	
	public void show() {
		
		System.out.println("In Beta");
	}
}


public class lb_01 {
	
	public static void main(String args[]) {
		
		Alpha a = new Alpha() {	// Anonymous inner class . this can only be used once.
			
			public void show() {
				
				System.out.println("new show of Alpha");
			}
			
			public void display() {
				
				System.out.println("New display");
			}
			
			public void getData() {
				
				System.out.println("New data");
				
			}
		};
		
		new Alpha() {	//Anonymous Inner Class, for getData() new object
			
			public void show() {
				
				System.out.println("new show of Alpha");
			}
			
			public void display() {
				
				System.out.println("New display");
			}
			
			public void getData() {
				
				System.out.println("New data");
				
			}
			
		}.getData();
		
		a.show();
		a.display();
		
//		Person obj = new Person();
//		obj.showName();
//		
//		Person.Phone p = obj.new Phone();
//		p.details();
		
	}

}
