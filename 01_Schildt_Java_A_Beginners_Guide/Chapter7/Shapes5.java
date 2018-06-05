//добавление дополнительных конструкторов в класс TwoDShapes

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


class Shapes5 {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("right", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		
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
		
		System.out.println("Info for t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area is " + t3.area());		
	}
}
