package JavaPractice;

public class JoinTest {
	
	public static void main(String[] args) {
		
			
		Thread t1 = new Thread(()->{
			
			System.out.println(" Inside thread 1");
			

		}
				);
		
		Thread t2 = new Thread(()->{
			
		try {
			t1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
			System.out.println(" Inside thread 2");
		}
				);
		
		Thread t3 = new Thread(()->{
			
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(" Inside thread 3");
		}
				);
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	
}
