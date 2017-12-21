import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main ................Enter a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		ArrayList<String> list = new ArrayList<>();
		for (int cnt = 0; cnt < 999999; cnt++) {
			list.add("cnt"+cnt);
			if( (cnt %100000)==0)
			{
				System.out.println("Current Count = " + cnt);
			}
		}
		for (int cnt = 0; cnt < 999999; cnt+=30000) {
			list.remove(cnt);
		}
		for (int cnt = 0; cnt < 999999; cnt+=10000) {
			list.add("mycnt"+cnt);
		}
		System.out.println("Current Size = " + list.size());
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime - starttime));
	}

}
