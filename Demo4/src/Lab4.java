import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main ................Enter a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		for (int cnt = 0; cnt < 999999; cnt++) {

			String sb = "this is test";
			for (int i = 0; i < 10; i++) {
				sb += String.valueOf(i);
			}
			if( (cnt %100000)==0)
			{
				System.out.println("Current Count = " + cnt);
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime - starttime));
	}

}
