import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main ................Enter a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		
		for (int cnt = 0; cnt < 999999; cnt++) {
			List<Emp> list1 = new ArrayList<>();
			for (int i = 0 ; i<5000; i++)
			{
				Emp e= new Emp(i, "nm"+i,i*100.11);
				list1.add(e);		
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
