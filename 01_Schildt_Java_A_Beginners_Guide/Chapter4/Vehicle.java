class Vehicle {
	int passengers; //количество пассажиров
	int fuelcap;   //ёмкость топливного бака
	int mpg;       //потребление топлива в милях на галлон
	
	//метод range() относится к классу Vehicle
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
	
	int myrange() {
		return fuelcap * mpg;
	}	
}