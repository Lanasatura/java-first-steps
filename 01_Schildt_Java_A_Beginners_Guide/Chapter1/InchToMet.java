/*таблица преобразований дюймов в метры*/

class InchToMet {
	public static void main(String args[]) {
		double inches, meters;
		int i, rows;
		
		inches = 0;
		rows = 0;
		
		for (i = 0; i < 36; i++) {
			
			inches = inches + 1;
			meters = inches / 39.37;
			System.out.println(inches + " inches is " + meters + " meters.");
			
			rows++;
			//System.out.println("rows = " + rows);
			if (rows == 12) {
				System.out.println();
				rows = 0;
			}
		}
	}
}