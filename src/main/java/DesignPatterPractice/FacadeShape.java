package DesignPatterPractice;

public class FacadeShape {
	private Circle circle;
	private Triangle triangle;
	
	FacadeShape(){
		circle = new Circle();
		triangle = new Triangle();
	}
	
	public void drawCricle() {
		circle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}
}
