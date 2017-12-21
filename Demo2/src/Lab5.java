import java.util.Scanner;

class MyMessage {
    public   String msg1;
    public  String msg2;
    }
class Thread1 extends Thread
{
    private MyMessage msg;
    
    public Thread1(MyMessage m){
        this.msg=m;
    }

    @Override
    public void run() {
     System.out.println( this.getName()  + "Getting lock on msg1..");
        synchronized (msg.msg1) {
        	System.out.println( this.getName()  + "Got lock on msg1 and waiting for msg2");
        	try {	Thread.sleep(5000);	} catch (InterruptedException e) {}
        	
        	synchronized (msg.msg2) {
                System.out.println( this.getName()  + "got lock on msg2 ...(and msg1 )");
                try {	Thread.sleep(5000);	} catch (InterruptedException e) {}
            }
            System.out.println( this.getName()  + "releasing lock on msg2");
        }
            System.out.println( this.getName()  + "releasing lock of msg1");
        }
    

}

class Thread2 extends Thread
{
    private MyMessage msg;
    
    public Thread2(MyMessage m){
        this.msg=m;
    }

    @Override
    public void run() {
     System.out.println( this.getName()  + "Getting lock on msg2..");
        synchronized (msg.msg2) {
        	System.out.println( this.getName()  + "Got lock on msg2 and waiting for msg1");
        	try {	Thread.sleep(5000);	} catch (InterruptedException e) {}
        	
        	synchronized (msg.msg1) {
                System.out.println( this.getName()  + "got lock on msg1 ...(and msg2 )");
                try {	Thread.sleep(5000);	} catch (InterruptedException e) {}
            }
            System.out.println( this.getName()  + "releasing lock on msg1");
        }
            System.out.println( this.getName()  + "releasing lock of msg2");
        }
    

}

public class Lab5 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting main ................Enter a number to continue");
		Scanner  scanner = new Scanner(System.in);
		scanner.nextInt();
		 MyMessage msg = new MyMessage();
		 msg.msg1="FirstMessage";
		 msg.msg2="SecondMessage";
		 Thread1 t1 = new Thread1(msg);
		 t1.setName("t1");
		 Thread2 t2 = new Thread2(msg);
		 t2.setName("t2");
		 t1.start();
		 t2.start();
	}

}
