import java.util.Date;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		String s ="a";
		for (int i = 0 ; i< 9999999; i++)
		{
			s += "a";
		//	Thread.sleep(1);
		/*if((i % 100000)==0)
			{
				System.gc();
			}*/
		}
		
		System.out.println("Ending main ...............");
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime));
	}

}
