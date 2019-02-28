package JavaPractice;

public class ImmutableTest {

	public static void main(String[] args) {
		
		Age age = new Age(1983,10,10);
		ImmutableStudent is = new ImmutableStudent("swad", 1, age);
		System.out.println(is.getAge().getYear());
		
		age.setYear(1990);
		System.out.println(is.getAge().getYear());
		
		is.getAge().setYear(2020);
		System.out.println(is.getAge().getYear());
		 
	}
}

final class  ImmutableStudent{
	
	private final String name;
	private final int id;
	private final Age age;
	
	public ImmutableStudent(String name, int id, Age age) {
		this.name = name;
		this.id = id;
		Age cloneAge = new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		this.age = cloneAge;
	
	}
	

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}	
	
	public Age getAge() {
		Age cloneAge = new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		return cloneAge;
	}
	
}

class Age{
	private int year;
	private int month;
	private int day;
	
	public Age() {}
	
	public Age(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
