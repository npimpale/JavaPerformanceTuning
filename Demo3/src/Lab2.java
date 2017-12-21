
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		
		FileInputStream  in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(args[0]);
			int i = in.read();
			out = new FileOutputStream(args[1]);
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
