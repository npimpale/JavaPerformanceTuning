import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		for(int cnt = 0;cnt < 999999;cnt++)
		{
		int n = 10;
		int x=6, y=3,z=5;
		int a[] = new int[n];
		x = y + z;
		for (int i = 0; i < n; i++) {
		   
		    a[i] = 6 * i + x * x;
		}
		}
		
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime) );
	}

}
