import java.io.*;

class CopyFile {
	public static void main(String args[]) {
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		
		if(args.length != 2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		try {  //открытие исходного файла
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException exc) {
			System.out.println("Input file not found.");
			return;
		}
		
		try {  //открытие целевого файла
			fout = new FileOutputStream(args[1]);
		}
		catch(FileNotFoundException exc) {
			System.out.println("Error opening output file.");
			
			try {  //закрытие исходного файла в случае возникновения ошибки открытия целевого файла
				fin.close();
			}
			catch (IOException exc2) {
				System.out.println("Error closing input file.");
			}
			return;
		}
		
		try {  //копирование файла
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while (i != -1);
		}
		catch(IOException exc) {
			System.out.println("File error");
		}
		
		try {
			fin.close();
		}
		catch(IOException exc) {
			System.out.println("Error closing input file.");
		}
		
		try {
			fout.close();
		}
		catch(IOException exc) {
			System.out.println("Error closing output file.");
		}

	}
}