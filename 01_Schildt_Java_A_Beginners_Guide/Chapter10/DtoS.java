//ввод с диска и вывод на экран с помощью класса FileReader
import java.io.*;

class DtoS {
	public static void main(String args[]) {
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}
		catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}		
	}
}