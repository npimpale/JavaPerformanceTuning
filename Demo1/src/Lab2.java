import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		
		for (int i = 0 ; i< 500; i++)
		{
			List<String> list1 = new ArrayList<>();
			for (int j = 0 ; i<99; j++)
			{
				list1.add("ss" + j);
			}
		}
		
		System.out.println("Ending main ...............");
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime));
	}

}
