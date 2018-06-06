//применение методов wait() и notify() для имитации часов
class TickTock {
	String state; //содержит сведения о состоянии часов
	
	synchronized void tick(boolean running) {
		if(!running) {  //остановить часы
			state = "ticked";
			notify();  //уведомить ожидающие потоки
			return;
		}
		
		System.out.print("Tick ");
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException exc) {
			System.out.println(Thread.currentThread().getName() + " interrupted.");
		}
		
		state = "ticked"; //установить текущее состояние после такта tick
		notify(); //метод tick() уведомляет метод tock() о возможности продолжить выполнение
		
		try {
			while(!state.equals("tocked"))
				wait();  //метод tick() ожидает завершения метода tock()
		}
		catch(InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
	
	synchronized void tock(boolean running) {
		if(!running) {  //остановить часы
			state = "tocked";
			notify();  //уведомить ожидающие потоки
			return;
		}
		
		System.out.println("Tock");
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException exc) {
			System.out.println(Thread.currentThread().getName() + " interrupted.");
		}
		
		state = "tocked"; //установить текущее состояние после такта tock
		notify(); //метод tock() уведомляет метод tick() о возможности продолжить выполнение
		
		try {
			while(!state.equals("ticked"))
				wait();  //метод tock() ожидает завершения метода tick()
		}
		catch(InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
}


class MyThread implements Runnable {
	Thread thrd;
	TickTock ttOb;
	
	//создать новый поток
	MyThread(String name, TickTock tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start();  //начать поток
	}
	
	//начать исполнение нового потока
	public void run() {
		if(thrd.getName().compareTo("Tick") == 0) {
			for(int i = 0; i < 5; i++) 
				ttOb.tick(true);
			ttOb.tick(false);
		}
		else {
			for(int i = 0; i < 5; i++)
				ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}


class ExcThreadCom {
	public static void main(String args[]) {
		TickTock tt = new TickTock();
		MyThread mt1 = new MyThread("Tick", tt);
		MyThread mt2 = new MyThread("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
	}
}