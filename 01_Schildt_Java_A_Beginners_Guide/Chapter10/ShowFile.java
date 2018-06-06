import java.io.*;

class ShowFile {
	public static void main(String args[]) {
		int i;
		FileInputStream fin;
		
		//массив args пуст, если при запуске программы не указан файл
		if(args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
		}
		catch (FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}
		
		try {
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);  //если i = -1, значит достигнут конец файла
		}
		catch (IOException exc) {
			System.out.println("Error reading file.");
		}
		
		try {
			fin.close();
		}
		catch (IOException exc) {
			System.out.println("Error closing file.");
		}
	}
}