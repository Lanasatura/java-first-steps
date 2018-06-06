//создание потока путём реализации интерфейса Runnable
class MyThread implements Runnable {
	String thrdName;
	
	//объекты типа MyThread выполняются в разных потоках, т.к. класс реализует Runnable
	MyThread(String name) {
		thrdName = name;
	}
	
	//точка входа в поток
	public void run() {
		System.out.println(thrdName + " starting.");
		
		try {
			for(int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName + " , count is " + count);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}
}


class UseThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		//построение объекта типа MyThread
		MyThread mt = new MyThread("Child #1");
		
		//формирование потока из этого объекта
		Thread newThrd = new Thread(mt);
		
		//старт исполнения потока
		newThrd.start();
		
		for(int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
		    }
		}
		
		System.out.println("Main thread ending.");
	}
}