//оператор try с ресурсами
import java.io.*;

class ShowFile3 {
	public static void main(String args[]) {
		int i;
		
		//массив args пуст, если при запуске программы не указан файл
		if(args.length != 1) {
			System.out.println("Usage: ShowFile FileName");
			return;
		}
		
		try(FileInputStream fin = new FileInputStream(args[0])) {			
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);  //если i = -1, значит достигнут конец файла
		}
		catch (IOException exc) {
			System.out.println("An I/O Error Occurred: " + exc);
		}
	}
}