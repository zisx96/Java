

class Alpha1{
	
	int a,b;
	
	public Alpha1() {
		
		a= 10;
		b=20;
		System.out.println("Alpha zero parameter constructor");
	}
	
	public Alpha1(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("Param Constructor of Alpha");
	}
}

class Beta1 extends Alpha1{
	
	int x, y;
	
	public Beta1() {
		
		x = 1;
		y = 2;
		System.out.println("Beta zero Param Constructor");
	}
	
	public Beta1(int x, int y) {
		
		this.x = x;
		this.y = y;
		System.out.println("Beta Param Constructor");	
	}
	
	public void disp() {
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("x " + x);
		System.out.println("y " + y);
	}
}



public class ConsIn_02 {
	
	public static void main(String a[]) {
		
		Beta1 b = new Beta1(21, 31);
		b.disp();
	}
}
