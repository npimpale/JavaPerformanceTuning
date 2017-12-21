import java.util.Scanner;

class Lab1Support extends Thread{
	@Override
	public void run() {
		int ans = 0;
		for(int i = 0; i< 500;i++){
			ans +=i;
			try {	Thread.sleep(100);	} catch (InterruptedException e) {}
		}
		System.out.println("Ans = " + ans + " in thread " + this.getName());
	}
	
}
public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
	
		Lab1Support t1 = new Lab1Support();
		t1.setName("first");

		Lab1Support t2 = new Lab1Support();
		t2.setName("Second");
		
		Lab1Support t3 = new Lab1Support();
		t3.setName("third");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
