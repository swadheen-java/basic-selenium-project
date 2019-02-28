package JavaPractice;

public class PassByValueTest {

	public static void main(String[] args) {
		
		//passing primitives
		int int1 = 1;
		int int2 = 2;
		
		System.out.println("before calling method: "+ int1 + " and "+int2);
		add(int1, int2);
		System.out.println("after calling method: "+ int1 + " and "+int2 +"\n");
		
		//passing wrappers
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		
		System.out.println("before calling method: "+ a + " and "+b);
		add(a,b);
		System.out.println("before calling method: "+ a + " and "+b +"\n");
		
		//passing Object
		Age age1 = new Age(1983,10,10);
		Age age2 = new Age(1990,9,9);
		
		System.out.println("before calling method: "+ age1.getYear() + " and "+age2.getYear());
		add(age1,age2);
		System.out.println("after calling method: "+ age1.getYear() + " and "+age2.getYear());
		
		
		
		
	}
	
	
	private static void add(int int1, int int2) {
		int1 = int1+10;
		int2 = int2+10;
		
		System.out.println("inside method: "+ int1 + " and "+int2);
		
	}
	
	private static void add(Integer int1, Integer int2) {
		int1 = int1+10;
		int2 = int2+10;
		
		System.out.println("inside method: "+ int1 + " and "+int2);
		
	}
	
	private static void add(Age age1, Age age2) {
		age1.setYear(2000);
		age2.setYear(2010);
		System.out.println("inside calling method: "+ age1.getYear() + " and "+age2.getYear());
		
	}
}

