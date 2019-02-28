package JavaPractice;

public class SingletonClass {
	private static volatile SingletonClass singletonClass;
	
	private SingletonClass(){
//		if(singletonClass != null) {
//			throw new RuntimeException();
//		}
		
	}
	
	public static  SingletonClass getIntance() {
	
			synchronized (SingletonClass.class) {   
				if(singletonClass ==null)
				singletonClass = new SingletonClass();
			}
			
	
		return singletonClass;
	}

}
