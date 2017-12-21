import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Lab2Support extends Thread{
	@Override
	public void run() {
		for (int i = 0 ; i< 500; i++)
		{
			List<String> list1 = new ArrayList<>();
			for (int j = 0 ; i<999999; j++)
			{
				list1.add("ss" + j);
			}
			/*	if((j%10000)==0)
			try {	Thread.sleep(100);	} catch (InterruptedException e) {}*/
		}
	
		System.out.println("Closing thread " + this.getName());
	}
}
public class Lab2 {

	public static void main(String[] args) {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		Lab2Support[] arr = new 	Lab2Support [10];
		for(int i = 0; i< 10; i++){
			arr[i] = new Lab2Support();
			if((i%5)==0)
				arr[i].setPriority(Thread.MAX_PRIORITY);
			if((i%3)==0)
					arr[i].setPriority(Thread.MIN_PRIORITY);
			
		
		}
		for(int i = 0; i< 10; i++){
			arr[i].start();
		}
	}

}
