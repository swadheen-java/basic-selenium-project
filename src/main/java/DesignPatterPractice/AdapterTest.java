package DesignPatterPractice;

public class AdapterTest {
	public static void main(String[] args) {
		Shape square = new Adapter(new SquareAdapter());
		square.draw();

		
	}

}
