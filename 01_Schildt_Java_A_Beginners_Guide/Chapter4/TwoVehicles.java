class TwoVehicles {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		//присовить значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//присовить значения полям в объекте sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);
	}
}