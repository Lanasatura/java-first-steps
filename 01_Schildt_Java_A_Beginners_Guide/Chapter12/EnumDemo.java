//перечисления
enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}


class EnumDemo {
	public static void main(String args[]) {
		//объявление ссылки на перечисление Transport
		Transport tp;
		
		//присваивание переменной tp константы AIRPLANE
		tp = Transport.AIRPLANE;
		
		//вывести перечислимое значение
		System.out.println("Value of tp: " + tp);
		System.out.println();
		
		tp = Transport.TRAIN;
		
		//проверка равенства двух объектов типа Transport
		if(tp == Transport.TRAIN)  //сравнить два перечислимых значения
			System.out.println("tp contains TRAIN.\n");
			
		switch(tp) {
			case CAR:
				System.out.println("A car carries people.");
				break;
			case TRUCK:
				System.out.println("A truck carries freight.");
				break;
			case AIRPLANE:
				System.out.println("An airplane flies.");
				break;
			case TRAIN:
				System.out.println("A train runs on rails.");
				break;
			case BOAT:
				System.out.println("A boat sails on water.");
				break;
		}
	}
}