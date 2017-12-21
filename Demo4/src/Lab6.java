import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main ................Enter a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		for (int cnt = 0; cnt < 999999; cnt++) {

			Vector<String> v1 = new Vector<>();
			for (int i = 0; i < 10; i++) {
				v1.add("item"+i);
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
