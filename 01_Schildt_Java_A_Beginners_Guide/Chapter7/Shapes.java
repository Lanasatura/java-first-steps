//простая иерархия классов

//класс, описывающий двумерные объекты
class TwoDShapes {
	double width;
	double height;
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

//подкласс класса TwoDShapes для представления треугольников
//класс Triangle наследует от класса TwoDShapes
class Triangle extends TwoDShapes {
	String style;
	
	double area() {
		return width * height / 2; //из подклсса возможно обращение к переменным суперкласса
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

//подкласс класса TwoDShapes для представления прямоугольников
class Rectangle extends TwoDShapes {
	boolean isSquare() {
		if(width == height) return true;
		return false;
	}
	
	double area() {
		return width * height;
	}
}


class Shapes {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "isosceles";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "right";
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
		System.out.println();
		
		Rectangle r1 = new Rectangle();
		r1.width = 6.0;
		r1.height = 6.0;
		
		System.out.println("Info for r1: ");
		if(r1.isSquare()) System.out.println("r1 is Square.");
		else System.out.println("r1 is not Square.");
		
		System.out.println("Area is " + r1.area());
	}
}
