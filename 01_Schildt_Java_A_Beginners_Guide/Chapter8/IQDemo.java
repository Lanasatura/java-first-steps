import qpack.*;

class IQDemo {
	public static void main(String args[]) {
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		DynQueue dq = new DynQueue(11);
		CircularQueue q3 = new CircularQueue(10);		
		ICharQ iQ;
		
		char ch;
		int i;
				
		iQ = q1;
		//поместить ряд символов в очередь фиксированного размера
		for(i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
		
		System.out.print("Contents of fixed queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		iQ = q2;
		//поместить ряд символов в динамическую очередь
		for(i = 0; i < 10; i++)
			iQ.put((char) ('Z' - i));
		
		System.out.print("Contents of dynamic queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		
		//поместить ряд символов в динамическую очередь q2
		for(i = 0; i < 10; i++)
			q2.put((char) ('Z' - i));		
		
		System.out.println(q2.getLength());
		System.out.println(dq.getLength());
		DynQueue.copy(dq, q2);
		
		System.out.print("Contents of dynamic queue q2: ");
		for(i = 0; i < 10; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println();
		
		System.out.print("Contents of dynamic queue dq: ");
		for(i = 0; i < 10; i++) {
			ch = dq.get();
			System.out.print(ch);
		}
		System.out.println();
		
		
		//поместить больше символов в динамическую очередь
		for(i = 10; i < 20; i++)
			iQ.put((char) ('A' + i));
		
		System.out.print("Contents of dynamic queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		iQ.reset();
		System.out.print("Contents of dynamic queue after reset: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();		
		
		iQ = q3;
		//поместить ряд символов в кольцевую очередь
		for(i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
		
		System.out.print("Contents of circular queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		//поместить больше символов в кольцевую очередь
		for(i = 10; i < 20; i++)
			iQ.put((char) ('A' + i));
		
		System.out.print("Contents of circular queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println("\nStore and consume from circular queue.");
		
		//поместить символы в кольцевую очередь и извлечь их оттуда
		for(i = 0; i < 20; i++) {
			iQ.put((char) ('A' + i));
		    ch = iQ.get();
			System.out.print(ch);
		}
	}
}


