
// wait() and notify() should be written in synchronized

class Producer extends Thread{
	
	Queue q;
	
	public Producer(Queue q) {
		
		this.q = q;
	}
	
	int i = 1;
	
	public void run() {
		
		while(true) {
			
			q.produce(i++);
		}
	}	
}

class Consumer extends Thread{
	
	Queue q;
	
	public Consumer(Queue q){
		
		this.q = q;
	}
	
	public void run() {
		
		while(true) {
			
			q.consume();
		}
	}
	
	
}

class Queue {
	
	int data;
	
	boolean flag = false;
	
	synchronized public void produce(int i) {
		
		try {
			
			if(flag == true) {
				
				System.out.println("producer in wait");
				
				wait();
			}
			else {
			
				data =  i;
		
				System.out.println("I have produced data: " + data);
			
				flag = true;
				
				notify();
			
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	synchronized public void consume() {
		
		try {
			
			if(flag == false) {
				
				System.out.println("consumer in wait");
				
				wait();
			}
			else {
			
				System.out.println("I have consumed the data: " + data);
				
				flag = false;
				
				notify();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
public class InterThread_01 {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		
//		new Producer(q).start();
//		new Consumer(q).start();
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		
		p.start();
		c.start();

	}

}
