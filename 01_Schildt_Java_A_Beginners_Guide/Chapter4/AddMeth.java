class AddMeth {
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
		
		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		
		minivan.range(); //отобразить дальность действия мини-фургона, вызвав метод range()
		
		System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
		
		sportscar.range();
		
		
		range1 = minivan.myrange();
		System.out.print("Minivan range is " + range1 + ". ");
	}
}