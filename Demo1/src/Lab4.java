import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		
		for (int i = 0 ; i< 5000; i++)
		{
			List<Emp> list1 = new ArrayList<>();
			for (int j = 0 ; i<99999; j++)
			{
				Emp e= new Emp(i, "nm"+i,i*100.11);
				list1.add(e);		
			}
		}
		System.out.println("Ending main ...............");
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime));
	}

}
