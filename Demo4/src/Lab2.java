import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main ................Enter a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		for (int cnt = 0; cnt < 999999; cnt++) {
			int n = 5000;
			List<String> l1 = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				l1.add("st" + i);
			}
		}

		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime - starttime));
	}

}
