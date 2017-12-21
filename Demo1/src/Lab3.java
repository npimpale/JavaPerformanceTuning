import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class Key
{
	private String keyname;
public Key(String keyname){
	this.keyname = keyname;
}	
}
public class Lab3 {

	public static void main(String[] args) {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		long starttime = System.currentTimeMillis();
		Map<Object , String > mymap = new HashMap<>();
		Key k1 = new Key("simple");
		for (int i = 0 ; i< 9999999; i++)
		{
			mymap.put(k1,"str"+i);
		}
		
		System.out.println("Ending main ...............");
		long endtime = System.currentTimeMillis();
		System.out.println("Time taken = " + (endtime-starttime));
	}

}
