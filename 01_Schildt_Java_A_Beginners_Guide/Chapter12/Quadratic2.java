//статический импорт
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadratic2 {
	public static void main(String args[]) {
		double a, b, c, x;
		
		//решить уравнение 4x^2 + x - 3 = 0
		a = 4;
		b = 1;
		c = -3;
		
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution: " + x);
		
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second solution: " + x);		
	}
}