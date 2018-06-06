//чтение байтов в массив
import java.io.*;

class ReadBytesExc {
	public static void tryRead(byte d[]) throws java.io.IOException, ArrayIndexOutOfBoundsException {
		try {
			System.in.read(d);
			d[11] = 7;
		}
		catch (java.io.IOException exc) {
			System.out.println(exc);
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println(exc);
		}
	}
}


class ReadBytes {
	public static void main(String args[])
		throws java.io.IOException, ArrayIndexOutOfBoundsException {
			byte data[] = new byte[10];
			
			System.out.println("Enter some characters.");
			
			//System.in.read(data);
			ReadBytesExc.tryRead(data);
			
			System.out.print("You entered: ");
			for(int i = 0; i < data.length; i++)
				System.out.print((char) data[i]);
		}
}
