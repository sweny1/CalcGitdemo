package com.test;

interface Area {
	void calculateCircleArea();

	void calculateRectangleArea();

	interface SquareArea {
		void calculateSquareArea();
	}
}

abstract class abst implements Area {
	public void calculateRectangleArea() {
		System.out.println("Rectangle area calculating from abstract class..");
	}

	// public void calculateCircleArea() {
	// TODO Auto-generated method stub

	// }

	abstract void Message();

}

class parentArea implements Area {

	public void calculateCircleArea() {
		System.out.println("Circle area calculating..");

	}

	public void calculateRectangleArea() {
		System.out.println("Rectangle area calculating..");
	}
}

class childArea implements Area.SquareArea {

	public void calculateSquareArea() {
		System.out.println("Square area calculating..");
	}

	public String getShapeName() {
		return "Square";
	}
}

class Example extends parentArea {
	public void Display() {
		System.out.println("Display method is calling..");
	}
}

class AbstractExample extends abst {
	public void Display() {
		System.out.println("Abstract Example Display method is calling..");
	}

	public void calculateRectangleArea() {
		System.out.println("Abstract class implements interface");

	}

	@Override
	void Message() {
		System.out.println("Abstract method of abstract class is calling");

	}

}

class NestedInheritanceExample {
	public static void main(String[] args) {

		try {
			Area p = new parentArea();
			p.calculateCircleArea();
			p.calculateRectangleArea();

			childArea c = new childArea();
			c.calculateSquareArea();

			Area.SquareArea c1 = new childArea();
			c1.calculateSquareArea();

			Example pa = new Example();
			pa.Display();

			// Example pa1 = (Example)new parentArea(); // gives complie time error
			// pa1.Display();

			parentArea pa2 = new parentArea();
			// pa2.Display();

			AbstractExample ab = new AbstractExample();
			ab.Display();

			abst abst = new AbstractExample();
			abst.calculateRectangleArea();
			abst.calculateCircleArea();
		} catch (Exception ex) {
			throw ex;
		}

	}
}