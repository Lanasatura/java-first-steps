//создание абстрактного класса

//TwoDShapes теперь является абстрактным
abstract class TwoDShapes {
	private double width;
	private double height;
	private String name;
	
	//конструктор по умолчанию
	TwoDShapes() {
		width = height = 0.0;
		name = "null";
	}
	
	//параметризированный конструктор суперкласса TwoDShapes
	TwoDShapes(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	//конструтор объекта с одинаковыми значениями переменных экземпляра width и height
	TwoDShapes(double x, String n) {
		width = height = x;
		name = n;
	}
	
	//конструктор, строящий один объект на основании другого
	TwoDShapes(TwoDShapes ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
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
	
	String getName() {
		return name;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	//метод area() теперь является абстрактным
	abstract double area();
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
	
	//параметризированный конструктор
	Triangle(String s, double w, double h) {
		super(w, h, "triangle");  //вызов конструктора суперкласса
		style = s;
	}
	
	//конструктор с одним аргументом
	Triangle(double x) {
		super(x, "triangle");  //вызов конструктора суперкласса
		style = "isosceles";
	}
	
	//конструктор, строящий один объект на основании другого
	Triangle(Triangle ob) {
		super(ob);  //передача ссылки на объект Triangle конструктору класса TwoDShapes
		style = ob.style;
	}
	
	//переопределение метода area() для класса Triangle
	double area() {
		return getWidth() * getHeight() / 2; //из подкласса возможно обращение к переменным суперкласса
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

//подкласс класса TwoDShapes для представления прямоугольников
//класс Rectangle наследует от класса TwoDShapes
class Rectangle extends TwoDShapes {	
	//конструктор по умолчанию
	Rectangle() {
		super();  //вызов конструктора суперкласса
	}
	
	//параметризированный конструктор
	Rectangle(double w, double h) {
		super(w, h, "rectangle");  //вызов конструктора суперкласса
	}
	
	//конструктор с одним аргументом для построения квадрата
	Rectangle(double x) {
		super(x, "rectangle");  //вызов конструктора суперкласса
	}
	
	//конструктор, строящий один объект на основании другого
	Rectangle(Rectangle ob) {
		super(ob);  //передача ссылки на объект Rectangle конструктору класса TwoDShapes
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	//переопределение метода area() для класса Rectangle
	double area() {
		return getWidth() * getHeight(); //из подкласса возможно обращение к переменным суперкласса
	}
}


class AbsShape {
	public static void main(String args[]) {
		TwoDShapes shapes[] = new TwoDShapes[4]; //массив объектов типа TwoDShapes!
		
		shapes[0] = new Triangle("right", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		
        for(int i = 0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
	}
}
