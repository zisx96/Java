import java.util.Scanner;

class Guess{
	
	int num;
	
	int guessingNumber(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser! Guess the nmumber");
		num = scan.nextInt();
		return num;
	}
}

class Player {
	
	int pnum;
	
	int guessingNumber(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Player Guess the nmumber");
		pnum = scan.nextInt();
		c++;
		return pnum;
	} 
}

class Umpire {
	
	int numg;
	int nump1;
	int nump2;
	int nump3;
	
	void CollectNumG() {
		
		Guess g = new Guess();
		numg = g.guessingNumber();
	}
	
	void CollectNumP(){
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		nump1 = p1.guessingNumber();
		nump2 = p2.guessingNumber();
		nump3 = p3.guessingNumber();
	}
	
	void Compare(){
		
		if(numg == nump1) {
			System.out.println("player 1 wins!");
		}
		else if(numg == nump2) {
			System.out.println("player 2 wins!");
		}
		else if(numg == nump3) {
			System.out.println("player 3 wins!");
		}
		else {
			System.out.println("no one wins!");
		}
	}
}

public class ScanInput {

	public static void main(String[] args) {
		
		Umpire um = new Umpire();
		um.CollectNumG();
		um.CollectNumP();
		um.Compare();
	}

}
