package Prototype;

public class Circle {
	/*
	 * Utility methods: not requiring creating of objects in order to use them.
	 */
	public static double getArea(double radius) {
		double area = 0.0;
		
		//correct implementation
		area = radius * radius * 3.14;
		
		//wrong implementation
		area = 2 * radius * 3.14;
				
		return area;
		
	}

}
