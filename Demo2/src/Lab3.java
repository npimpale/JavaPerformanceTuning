import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Lab3Support extends Thread{
	static List<String> list1 =  Collections.synchronizedList(new ArrayList<String>());
	@Override
	public void run() {
		for (int i = 0 ; i< 58000; i++)
		{
				list1.add("ss" + i);
				if((i%10000)==0)
					try {	Thread.sleep(1000);	} catch (InterruptedException e) {}

		}
						
		System.out.println("Closing thread " + this.getName() + " current size =" + list1.size());
	}
}
public class Lab3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		Lab3Support[] arr = new 	Lab3Support [15];
		for(int i = 0; i< 15; i++){
			arr[i] = new Lab3Support();
		}
		for(int i = 0; i< 15; i++){
			arr[i].start();
		}
		for(int i = 0; i< 15; i++){
			arr[i].join();
		}
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime));
	}

}
