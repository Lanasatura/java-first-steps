import java.io.*;

class ShowFile2 {
	public static void main(String args[]) {
		int i;
		FileInputStream fin = null;
		
		//массив args пуст, если при запуске программы не указан файл
		if(args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);  //если i = -1, значит достигнут конец файла
		}
		catch (FileNotFoundException exc) {
			System.out.println("File not found");
		}		
		catch (IOException exc) {
			System.out.println("An I/O Error Occurred");
		}
		finally {  //файл закрывается в любом случае
			try {
				if(fin != null) fin.close();
			}
			catch (IOException exc) {
			System.out.println("Error closing file.");
		    }
		}
	}
}