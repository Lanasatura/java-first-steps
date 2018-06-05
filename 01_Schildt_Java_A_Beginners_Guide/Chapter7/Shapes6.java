//многоуровневая иерархия

//класс, описывающий двумерные объекты
class TwoDShapes {
	private double width;
	private double height;
	
	//конструктор по умолчанию
	TwoDShapes() {
		width = height = 0.0;
	}
	
	//параметризованный конструктор суперкласса TwoDShapes
	TwoDShapes(double w, double h) {
		width = w;
		height = h;
	}
	
	//конструтор объекта с одинаковыми значениями переменных экземпляра width и height
	TwoDShapes(double x) {
		width = height = x;
	}
	
	double getWidth() {
		return width;
	}	
	double getHeight() {
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}	
	void setHeight(double h) {
		height = h;
	}	
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

//подкласс класса TwoDShapes для представления треугольников
//класс Triangle наследует от класса TwoDShapes
class Triangle extends TwoDShapes {
	private String style;
	
	//конструктор по умолчанию
	Triangle() {
		super();  //вызов конструктора суперкласса
		style = "null";
	}
	
	//параметризованный конструктор
	Triangle(String s, double w, double h) {
		super(w, h);  //вызов конструктора суперкласса
		style = s;
	}
	
	//конструктор с одним аргументом
	Triangle(double x) {
		super(x);  //вызов конструктора суперкласса
		style = "isosceles";
	}	
	
	double area() {
		return getWidth() * getHeight() / 2; //из подклсса возможно обращение к переменным суперкласса
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

//подкласс, производный от класса Triangle
//в класс ColorTriangle входят переменные и методы, 
//как из класса Triangle, так и из класса TwoDShapes
class ColorTriangle extends Triangle {
	private String color;
	
	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
	}
	
	String getColor() {
		return color;
	}
	void showColor() {
		System.out.println("Color is " + color);
	}
}


class Shapes6 {
	public static void main(String args[]) {
		ColorTriangle t1 = new ColorTriangle("Blue", "right", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("Red", "isosceles", 2.0, 2.0);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Area is " + t2.area());
	}
}
