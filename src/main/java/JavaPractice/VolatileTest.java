package JavaPractice;

public class VolatileTest {
	
	static boolean flag = true;
	public static void main(String[] args) {
		
		 
		Runnable runnable1 = ()-> {
//		for (int i=0; i<10000; i++) {
				while(flag) {
				System.out.println("i am here " );
			}
//				}
		};

		Runnable runnable2 = ()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			flag = false;
			System.out.println("flag is set to false");
		};
		
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		t1.start();
		t2.start();
		


		
	}
	
	
	

}
