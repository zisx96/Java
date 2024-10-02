
// daemon thread -> at last it gets executed once

class MsWord extends Thread {
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		if(name.equals("TYPE")) {
			
			typing();
		}
		else if(name.equals("SPELL")) {
			
			checkingSpelling();
		}
		
		else {
			
			autoSaving();
		}
	}
	
	public void typing() {
		
		try {
			
			for(int i =0; i<3; i++) {
				
				System.out.println("Typing....");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void checkingSpelling() {
		
		try {
			
			for(;;) {
				
				System.out.println("Spell Checking....");
				Thread.sleep(3000);
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

	public void autoSaving() {
	
		try {
			
			for(;;) {
				
				System.out.println("Auto Saving....");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}

public class Thread_09 {

	public static void main(String[] args) {
			
		MsWord ms1 = new MsWord();
		MsWord ms2 = new MsWord();
		MsWord ms3 = new MsWord();
		
		ms1.setName("TYPE");
		ms2.setName("SPELL");
		ms3.setName("SAVING");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms2.setPriority(4);
		ms3.setPriority(3);
		
		ms1.start();
		ms2.start();
		ms3.start();	
		
		
	}
	
}
