class Vehicle {
	private int passengers; //количество пассажиров
	private int fuelcap;    //ёмкость топливного бака
	private int mpg;        //потребление топлива в милях на галлон
	
	//конструктор класса Vehicle
	Vehicle (int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	//метод класса Vehicle, возвращающий дальность действия транспортного средства
	int range() {
		return fuelcap * mpg;
	}

	//метод класса Vehicle, рассчитывающий объём топлива, необходимого транспортному средству для преодоления заданного расстояния
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
	
	//методы доступа к переменным экземпляра
	int getPassengers() {
		return passengers;
	}
	void setPassengers(int p) {
		passengers = p;
	}
	
	int getFuelcap() {
		return fuelcap;
	}
	void setFuelcap(int f) {
		fuelcap = f;
	}
	
	int getMpg() {
		return mpg;
	}
	void setMpg(int m) {
		mpg = m;
	}	
}

//расширение класса Vehicle для грузовиков
class Truck extends Vehicle {
	private int cargocap;  //грузоподъёмность
	
	//конструктор класса Truck
	Truck(int p, int f, int m, int c) {
		super(p, f, m);
		cargocap = c;
	}
	
	int getCargo() {
		return cargocap;
	}	
	void putCargo(int c) {
		cargocap = c;
	}
}


class TruckDemo {
	public static void main(String args[]) {
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		
		System.out.println("Semi can carry  " + semi.getCargo() + " pounds.");
		System.out.println("To go " + dist + " semi needs " + gallons + " gallons of fuel.\n");
		
		gallons = pickup.fuelneeded(dist);
		
		System.out.println("Pickup can carry  " + pickup.getCargo() + " pounds.");
		System.out.println("To go " + dist + " pickup needs " + gallons + " gallons of fuel.\n");
	}
}