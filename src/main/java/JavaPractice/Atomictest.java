package JavaPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomictest {

//	public static AtomicInteger i = new AtomicInteger(0);
//	
//	public static void main(String[] args) {
//		
//		System.out.println(i.get());
//		
//		new Thread(()->{
//			while(true) {
//				System.out.println(" from thread1 :"+ i.getAndIncrement());
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//				).start();
//		
//		
//		new Thread(()->{
//			while(true) {
//				System.out.println("from thread2 : "+ i.getAndIncrement());
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//		}
//				).start();
//	}
	
	public static void main(String[] args) {
		new Thread(
				()->{
					Single s1 = Single.getInstance();
					System.out.println(s1.hashCode());
				}
				).start();
		
		new Thread(
				()->{
					Single s2 = Single.getInstance();
					System.out.println(s2.hashCode());
				}
				).start();
	}
}

class Single{
	
	private  static  Single single;
	
	private Single(){
		
	}
	
	public static Single getInstance() {
		if(single==null)
		{
			synchronized (Single.class) {
				if(single==null)
				single = new Single();
			}
			
		}
		return single;
	}
	
}