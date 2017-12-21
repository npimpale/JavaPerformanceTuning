
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
	
		FileInputStream fis = null;
		FileOutputStream fos = null;
		FileChannel inputChannel =null;
		FileChannel outputChannel =null;
		ByteBuffer buffer = ByteBuffer.allocate(1024*128);
	    
	    try {
	    	fis = new FileInputStream(args[0]);
	    	fos = new FileOutputStream(args[1]);
	    	inputChannel = fis.getChannel();
	    	outputChannel = fos.getChannel();
	    	int i = 0;
	    	do{
	    		buffer.clear();
	    		i = inputChannel.read(buffer);
	    		buffer.flip();
	    		outputChannel.write(buffer);
			}while( i != -1);
		} catch (Exception e) {
			System.out.println("Exception e " + e);
		} finally {
			fis.close();
			fos.close();
		}
	    
	    long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime)  + " for " + new File(args[0]).length());
	}

}
