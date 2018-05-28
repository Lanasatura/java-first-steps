class NestVarError {
	public static void main(String args[]) {
		int count;
		
		for (count = 0; count < 10; count++) {
			
			System.out.println("This is count: " + count);
			
			//int count; //ошибка! объявление переменной во внутреннем блоке
			           //с тем же именем, что уже есть во внешнем
					   
            //for (count = 0; count < 3; count++) 
			//	System.out.println("This won't work");
		
			int count_inner;
					   
            for (count_inner = 0; count_inner < 3; count_inner++) 
				System.out.println("This is count_inner: " + count_inner);		
			
		}
	}
}