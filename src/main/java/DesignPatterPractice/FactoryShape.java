package DesignPatterPractice;

public class FactoryShape {
	public Shape getShape(String shapeType) {
		
		if("triangle".equals(shapeType)) 
			{ return new Triangle();
			}
		else if("circle".equals(shapeType)) 
		{ 
			return new Circle();
			}
		return null;
	}

}
