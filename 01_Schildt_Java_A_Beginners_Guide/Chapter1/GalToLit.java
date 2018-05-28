/*преобразование галлонов в литры*/

class GalToLit {
	public static void main(String args[]) {
		double gallons, liters;
		
		gallons = 10;
		liters = gallons * 3.7854;
		
		System.out.print(gallons + " gallons is " + liters + " liters.");
	}
}