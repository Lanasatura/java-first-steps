//приостановка, возобновление и остановка потока
class MyThread implements Runnable {
	Thread thrd;
	
	//если suspended принимает значение true, исполнение потока приостанавливается
	volatile boolean suspended;
	
	//если stopped принимает значение true, исполнение потокаа прекращается
	volatile boolean stopped;
	
	MyThread(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	
	public void run() {
		System.out.println(thrd.getName() + " starting." );
		
		try {
			for(int i = 1; i < 1000; i++) {
				
				System.out.print(i + " " );
				if((i%10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				synchronized(this) {  //проверка условий приостановки и остановки потока
					while(suspended) {
						wait();
					}
					if(stopped)
						break;
				}
				
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		
		System.out.println(thrd.getName() + " exiting.");
	}
	
	//остановить поток
	synchronized void mystop() {
		stopped = true;
		
		//полная остановка приостановленного потока
		suspended = false;
		notify();
	}
	
	//приостановить поток
	synchronized void mysuspend() {
		suspended = true;
	}
	
	//возобновить поток
	synchronized void myresume() {
		suspended = false;
		notify();
	}		
}


class Suspend {
	public static void main(String args[]) {
		MyThread ob1 = new MyThread("My Thread");
		
		try {
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);

			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Stopping thread.");
			ob1.mystop();
		}
		catch(InterruptedException exc) {
			System.out.println("Main Thread interrupted.");
		}
		
		try {
			ob1.thrd.join();
		}
		catch(InterruptedException exc) {
			System.out.println("Main Thread interrupted.");
		}
		
		System.out.println("Main Thread exiting.");
	}
}