package codingPrj.studycode.remind.Exception;

class multi extends Thread {
	
	@Override
	public void run() {

		try {
		int i = 0;
		while(true) {
			
			i++;
			System.out.println( i + ", " +Thread.currentThread().getName());
			
			Thread.sleep(1000);
		}
		
		} catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
			
		}
	}
	


class interMulti implements Runnable {
	
	@Override
	public void run() {
		
		try {
			for(int i = 1 ; ; i++) {
				System.out.println( i + ", " +Thread.currentThread().getName());
			
			Thread.sleep(1000);	
			}
			
		} catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
	}
}

public class ExThread {

	public static void main(String[] args) {

		
//		multi a = new multi();
//		a.start();
//		
		interMulti b = new interMulti();
//		Thread bb = new Thread(b);
//		bb.start();
		
		Thread thread_A = new Thread(b , "first");
		Thread thread_B = new Thread(b , "second");
		Thread thread_C = new Thread(b , "third");
		
		thread_A.start();
		thread_B.start();
		thread_C.start();
	
		
		
		
		
		
	}

}
