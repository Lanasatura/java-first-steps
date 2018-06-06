//вывод данных на консоль с помощью класса PrintWriter
import java.io.*;

public class PrintWriterDemo {
	public static void main(String args[]) {
		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		double d = 123.65;
		
		pw.println("Using a PrintWriter.");
		pw.println(i);
		pw.println(d);
		pw.println(i + " + " + d + " is " + (i+d));
		//pw.println("Я женщина, я - украинка, и нет никого сильнее.");
	}
}