//решение квадратного уравнения без статического импорта
class Quadratic {
	public static void main(String args[]) {
		double a, b, c, x;
		
		//решить уравнение 4x^2 + x - 3 = 0
		a = 4;
		b = 1;
		c = -3;
		
		x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution: " + x);
		
		x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second solution: " + x);		
	}
}