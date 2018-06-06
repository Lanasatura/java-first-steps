//применение конструктора, переменной экземпляра и метода в перечислении
enum Transport {
	//константы с инициализирующими значениями
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	//объявление переменной экземпляра
	private int speed;
	
	//объявление конструктора
	Transport(int s) {
		speed = s;
	}
	
	//объявление метода
	int getSpeed() {
		return speed;
	}
}


class EnumDemo3 {
	public static void main(String args[]) {
		Transport tp;
		
		//отобразить скорость самолёта
		System.out.println("Typical speed for an airplane is " + 
		                   Transport.AIRPLANE.getSpeed() + " miles per hour.\n");
						   
		//отобразить все виды транспорта и скорости передвижения
		System.out.println("All transports speeds: ");
		for(Transport t: Transport.values())
			System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
	}
}