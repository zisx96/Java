import java.util.Scanner;

class Alpha {
	
	int id;
	String name;
	String course;
}

public class Array_05 {

	public static void main(String[] args) {
		
		Alpha[] arr = new Alpha[3];
		
		Scanner sc = new Scanner(System.in);
		
		arr[0] = new Alpha();
		arr[1] = new Alpha();
		arr[2] = new Alpha();
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = new Alpha();
			
			System.out.print("Enter id: ");
			arr[i].id = sc.nextInt();
			
			System.out.print("Enter name: ");
			arr[i].name = sc.next();
			
			System.out.print("Enter course: ");
			arr[i].course = sc.next();
		
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("Detail: " + " id: " + arr[i].id + " Name: " + arr[i].name + " Course: " + arr[i].course );
		}
		
//		arr[0].id = 1;
//		arr[0].name = "Rohan";
//		arr[0].course = "Spring";
		
//		System.out.println(arr[0].id);
//		System.out.println(arr[0].name);
//		System.out.println(arr[0].course);
		
//		System.out.println(arr[0]);
	}
	

}
