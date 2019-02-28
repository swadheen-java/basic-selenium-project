package JavaPractice;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		new Thread( ()-> {
			SingletonClass sc1 = SingletonClass.getIntance();
			System.out.println(" hashcode value of 1st instance: "+sc1.hashCode());
			
		}
				).start();
		
		new Thread(()-> {
			SingletonClass sc2 = SingletonClass.getIntance();
			System.out.println(" hashcode value fo 2nd instance: "+sc2.hashCode());
		}
				).start();
	}

}
