package com.factorydesign;

public class Shapefactory {

	public Shape getShape(String shapename) {
		
		if(shapename.equals("rectangle")) {
			return new Rectangle();
		}
		else if(shapename.equals("circle")) {
			return new Circle();
			
		}
		else if (shapename.equals("square")) {
			return new Square();
		}
			
	
	return null;
}
}