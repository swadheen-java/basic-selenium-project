package DesignPatterPractice;

public class Adapter implements test.Shape {

	ShapeNew shapeNew;
	
	Adapter(ShapeNew shapeNew){
		super();
		this.shapeNew=shapeNew;
	}

	@Override
	public void draw() {
		shapeNew.drawShape();
		
	}
	
}
