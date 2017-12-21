import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main ................Enter a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		for (int cnt = 0; cnt < 999999; cnt++) {

			Set<String> set1 = new HashSet<>();
			for (int i = 0; i < 10; i++) {
				set1.add("set"+ i);
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
