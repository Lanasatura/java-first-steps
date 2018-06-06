//произвольный доступ к файлам
import java.io.*;

class RandomAccessDemo {
	public static void main(String args[]) {
		double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
		double d;
		
		//открытие файла с произвольным доступом для записи и чтения
		try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
						
			for(int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);     //запись значений в файл
			}
			
			raf.seek(0);   //найти первое значение типа double
			d = raf.readDouble();
			System.out.println("First value is " + d);
			
			raf.seek(8);   //найти второе значение типа double, каждое значение типа double занимает 8 байтов
			d = raf.readDouble();
			System.out.println("Second value is " + d);
			
			raf.seek(8*3); //найти четвёртое значение типа double
			d = raf.readDouble();
			System.out.println("Fourth value is " + d);
			
			System.out.println();
			
			System.out.println("Here is every other value: ");
			for(int i = 0; i < data.length; i += 2) {
				raf.seek(8 * i); //найти i-ое значение типа double
				d = raf.readDouble();
				System.out.print(d + " ");
			}
		}
		catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}