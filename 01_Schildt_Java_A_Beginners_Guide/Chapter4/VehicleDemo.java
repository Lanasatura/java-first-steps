class VehicleDemo {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(); //новый объект типа Vehicle
		int range;
		
		//присовить значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//рассчитать дальность действия транспортного средства,
		//исходя из того, что топливный бак заполнен
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
	}
}