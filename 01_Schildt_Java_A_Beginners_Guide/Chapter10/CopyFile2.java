import java.io.*;

class CopyFile2 {
	public static void main(String args[]) throws IOException {
		int i;
		
		if(args.length != 2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		try(FileInputStream fin = new FileInputStream(args[0]);
		    FileOutputStream fout = new FileOutputStream(args[1], false/*true*/)) {

			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while (i != -1);
		}
		catch(IOException exc) {
			System.out.println("I/O error: " + exc);
		}
	}
}