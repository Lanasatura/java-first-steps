class LowCase {
	public static void main(String args[]) {
		char ch;
		
		for(int i = 0; i < 10; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			
			//в этом операторе устанавливается шестой бит
			//после этого в переменной ch будет храниться код символа строчной буквы
			ch = (char) ((int) ch | 32);
			
			System.out.print(ch + " ");
		}
	}
}