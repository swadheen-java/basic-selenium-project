package DesignPatterPractice;

public class FactoryTest {
	public static void main(String[] args) {
		FactoryShape fts = new FactoryShape();
		Shape shape = fts.getShape("circle");
		shape.draw();
		
		Shape shape1 = fts.getShape("triangle");
		shape1.draw();
	}

}
