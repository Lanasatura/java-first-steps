enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}


class EnumDemo2 {
	public static void main(String args[]) {
		//объявление ссылки на перечисление Transport
		Transport tp;
		
		System.out.println("Here are all Transport constants");
		
		for(Transport t: Transport.values())
			System.out.println(t);
		
		System.out.println("Here are all Transport constants");
		
		//получение массива констант типа Transport с помощью метода values()
		Transport allTransports[] = Transport.values();
		for(Transport t: allTransports)
			System.out.println(t);
		
		System.out.println();
		
		//получение константы под названием AIRPLANE с помощью метода valueOf()
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contains " + tp);		
	}
}