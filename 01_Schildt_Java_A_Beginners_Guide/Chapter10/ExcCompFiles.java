//сравнение файлов
import java.io.*;

class ExcCompFiles {
	public static void main(String args[]) {
		int i = 0, j = 0, cnt = 0;
		
		if(args.length != 2) {
			System.out.println("Usage: CompFiles f1 f2");
			return;
		}
		
		try(FileInputStream f1 = new FileInputStream(args[0]);
		    FileInputStream f2 = new FileInputStream(args[1])) {
				
			do {
				i = f1.read();
				j = f2.read();
				cnt ++;
				if((i != j) & (Math.abs(i-j) != 32)) break;
			} while ((i != -1) && (j != -1));
				
			if((i != j) & (Math.abs(i-j) != 32)) {
				System.out.println("Files are differ from " + cnt + " character.");
				System.out.println((char)i + " " + (char)j);
			}
			else
				System.out.println("Files are the same.");
		}
		catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}