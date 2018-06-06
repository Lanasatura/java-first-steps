//перечисление, представляющее состояния светофора
enum TrafficLightColor {
	RED, GREEN, YELLOW
}


class TrafficLightSimulator implements Runnable {
	private Thread thrd;            //поток для имитации светофора
	private TrafficLightColor tlc;  //текущий цвет светофора
	boolean stop = false;           //остановка имитации если истинно
	boolean changed = false;        //переключение светофора если истинно
	
	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		
		thrd = new  Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	public void run() {
		while(!stop) {
			try {
				switch(tlc) {
					case GREEN:
						Thread.sleep(10000);  //зелёный на 10 сек
						break;
					case YELLOW:
						Thread.sleep(2000);  //жёлтый на 2 сек
						break;
					case RED:
						Thread.sleep(12000);  //красный на 12 сек
						break;
				}
			}
			catch(InterruptedException exc) {
				System.out.println(exc);
			}
			
			changeColor();
		}
	}
	
	synchronized void changeColor() {
		switch(tlc) {
			case RED:
				tlc = TrafficLightColor.GREEN;
				break;
			case YELLOW:
				tlc = TrafficLightColor.RED;
				break;
			case GREEN:
				tlc = TrafficLightColor.YELLOW;
				break;				
		}
		
		changed = true;
		notify();
	}
	
	synchronized void waitForChange() {
		try {
			while(!changed)
				wait();        //ожидать переключения цвета светофора
			
			changed = false;
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	TrafficLightColor getColor() {
		return tlc;
	}
	
	void cancel() {
		stop = true;
	}
}


class TrafficLightDemo {
	public static void main(String args[]) {
		TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		for(int i = 0; i < 9; i++) {
			System.out.println(tl.getColor());
			tl.waitForChange();
		}
		
		tl.cancel();
	}
}