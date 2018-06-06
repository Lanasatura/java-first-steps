//упаковка и распаковка значений вручную
class Wrap {
	public static void main(String args[]) {
		//упаковка значения 100
		Integer iOb = new Integer(100);
		
		//распаковка значения 100
		int i = iOb.intValue();
		
		System.out.println(i + " " + iOb);
	}
}