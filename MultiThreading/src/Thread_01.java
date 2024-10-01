
public class Thread_01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Application Started ......");
		
		//Thread.sleep(5000);
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		Thread.sleep(4000);
		
		thread.setName("Java");
		thread.setPriority(3);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		System.out.println("Application Terminated");
	}

}
