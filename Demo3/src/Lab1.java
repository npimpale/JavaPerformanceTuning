import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader(args[0]));
			int i = in.read();
			out = new BufferedWriter(new FileWriter(args[1]));
			while (i != -1) {
				out.write(i);
				i = in.read();
			}
		} catch (Exception e) {
			System.out.println("Exception e " + e);
		} finally {
			in.close();
			out.close();
		}
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime)  + " for " + new File(args[0]).length());
	}

}
