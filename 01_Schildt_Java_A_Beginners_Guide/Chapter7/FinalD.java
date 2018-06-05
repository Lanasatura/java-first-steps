class ErrorMsg {
	//объявление констант
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	
	String msgs[] = {
		"Output error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds"
	};
	
	//метод возвращает объект типа String в виде сообщения об ошибке
	String getErrorMsg(int i) {
		if((i >= 0) & (i < msgs.length))
			return msgs[i];
		else
			return "Invalid Error Code";
	}
}


class FinalD {
	public static void main(String args[]) {
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));
	}
}