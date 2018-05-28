class TillDot {
	public static void main(String args[])
	  throws java.io.IOException {
		  char ch, ignore;
		  int space_cnt = 0;
		  
		  do {
			System.out.println("Press any key: ");
			ch = (char) System.in.read();
			
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
			if(ch == ' ') space_cnt++;
		  } while(ch != '.');
		  
		  System.out.println("The quantity of spaces is: " + space_cnt);
	  }
}