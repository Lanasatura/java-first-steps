/*таблица преобразований галлонов в литры*/

class GalToLitTable {
	public static void main(String args[]) {
		double gallons, liters;
		int i, rows;
		
		gallons = 0;
		rows = 0;
		
		for (i = 0; i < 30; i++) {
			
			gallons = gallons + 1;
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			rows++;
			//System.out.println("rows = " + rows);
			if (rows == 10) {
				System.out.println();
				rows = 0;
			}
		}
	}
}