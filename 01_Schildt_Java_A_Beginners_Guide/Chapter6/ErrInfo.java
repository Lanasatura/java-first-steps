class Err {
	String msg;    //сообщение об ошибке
	int severity;   //код серьёзности ошибки
	
	Err(String m, int s) {
		msg = m;
		severity = s;
	}	
}


class ErrorInfo {
	String msgs[] = {
		"Output error",
		"Input Error",
		"Disk Full",
		"Index Out-Of_Bounds"
	};
	int howbad[] = {3, 3, 2, 4};
	
	//возвращает значение типа Err
	Err getErrorInfo(int i) {
		if((i >= 0) & (i < msgs.length))
			return new Err(msgs[i], howbad[i]);
		else
			return new Err("Invalid Error Code", 0);
	}
}


class ErrInfo {
	public static void main(String args[]) {
		ErrorInfo err = new ErrorInfo();
		Err e;

		//метод getErrorInfo возвращает значение типа Err, поэтому его можно присваивать объекту e
		e = err.getErrorInfo(2);
		System.out.println(e.msg + " severity: " + e.severity);
		
		e = err.getErrorInfo(19);
		System.out.println(e.msg + " severity: " + e.severity);
	}
}