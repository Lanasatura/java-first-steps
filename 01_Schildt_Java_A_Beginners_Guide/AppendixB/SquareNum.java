import java.io.*;

/**
* Класс, демонстрирующий применение документирующих комментариев.
* @author Herbert Schildt
* @version 1.2
*/

public class SquareNum {
	/**
	* Этот метод возвращает квадрат значения параметра num.
	* Это описание состоит из нескольких строк. Число строк не ограничивается.
	* @param num Значение, которое требуется возвести в квадрат.
	* @return Квадрат числового значения параметра num.
	*/
	public  double  square(double num) {
		return num * num;
	}
	
	/**
	* Этот метод получает значение, введённое пользователем.
	* @return Введённое значение типа double.
	* @exception IOException Exception in input-output.
	* @see IOException
	*/
	public double getNumber() throws IOException {
		//создать поток BufferReader из стандартного потока System.in.
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inData = new BufferedReader(isr);
		String str;
		
		str = inData.readLine();
		return (new Double(str)).doubleValue();
	}
	
	/**
	* В этом методе демонстрируется применение метода square().
	* @param args Не используетсяю
	* @exception IOException Exception in input-output.
	* @see IOException
	*/
	public static void main(String args[]) throws IOException {
		SquareNum ob = new SquareNum();
		double val;
		
		System.out.println("Enter value to be squared: ");
		val = ob.getNumber();
		val = ob.square(val);
		
		System.out.println("Squared value is " + val);
	}
}