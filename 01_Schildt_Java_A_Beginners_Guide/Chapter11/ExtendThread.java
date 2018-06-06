//создание потока путём расширения класса Thread
class MyThread extends Thread {
		
	//построить новый поток
	MyThread(String name) {
		super(name);  //присвоить потоку имя
		start();      //начало исполнения потока
	}
	
	//начать исполнение нового потока
	public void run() {
		System.out.println(getName() + " starting.");
		
		try {
			for(int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + " , count is " + count);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating.");
	}
}


class ExtendThread {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		//теперь поток начинается при его создании
		MyThread mt = new MyThread("Child #1");
		
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