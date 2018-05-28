class Vehicle {
	int passengers; //количество пассажиров
	int fuelcap;   //ёмкость топливного бака
	int mpg;       //потребление топлива в милях на галлон
	
	//метод range() относится к классу Vehicle
	int range() {
		return fuelcap * mpg;
	}	
}

class RetMeth {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minivan.range();
		range2 = sportscar.range();
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1 + " miles.");
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2 + " miles.");
	}
}