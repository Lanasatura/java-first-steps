/*цикл for*/

class ForDemo {
	public static void main(String args[]) {
		int count;
		int var = 2;
		
		for (count = 0; count < 5; count++) {
			var = var * 2;
			System.out.println("This is count: " + count + " var = " + var);
		}		
		
		System.out.println("Done!");
	}
}