import java.io.*;

class ExcCopyFileChStr {
	public static void main(String args[]) {
		int i;
		
		if(args.length != 2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		try (FileReader fr = new FileReader(args[0]);
		     FileWriter fw = new FileWriter(args[1])) {
			do {
				i = fr.read();
				if((char)i == ' ') fw.write('-');
				else if(i != -1) fw.write(i);
			} while (i != -1);			
		}		
		catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}

	}
}