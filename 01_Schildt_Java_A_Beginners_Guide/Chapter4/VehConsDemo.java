class Vehicle {
	int passengers; //количество пассажиров
	int fuelcap;    //ёмкость топливного бака
	int mpg;        //потребление топлива в милях на галлон
	
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
}


class VehConsDemo {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		double gallons;
		int dist = 252;
		
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		
		gallons = sportscar.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}
}