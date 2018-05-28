class UpToLow {
	public static void main(String args[])
	  throws java.io.IOException {
		  char ch, ignore, rev;
		  int change_cnt = 0;
		  
		  do {
			  System.out.println("Press any key: ");
			  ch = (char) System.in.read();
			
			  do {
				  ignore = (char) System.in.read();
			  } while (ignore != '\n');
			  
			  if(ch >= 'A' & ch <= 'Z') {
				  rev = (char) (ch + 32);
				  change_cnt++;
			  }
			  else if(ch >= 'a' & ch <= 'z') {
				  rev = (char) (ch - 32);
				  change_cnt++;
			  } 
			  else rev = ch;
			  
			  System.out.println("The character: " + ch);
			  System.out.println("Upper/Lower case of the letter: " + rev);
			
		  } while(ch != '.');
		  
		  System.out.println("The quantity of case changes is: " + change_cnt);
	  }
}