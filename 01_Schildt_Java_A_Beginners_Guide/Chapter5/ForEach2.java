class ForEach2 {
	public static void main(String args[]) {
		int sum = 0;
		int nums[][] = new int[3][5];
		
		//заполнение массива
		for(int i = 0; i < 3; i++) 
			for(int j = 0; j < 5; j++)
				nums[i][j] = (i + 1)*(j + 1);
		
        //отображение значений массива
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print(nums[i][j] + " ");
			System.out.println();
		}
		System.out.println();
			
		//суммирование значений с помощью for-each
		for(int x[]: nums) {
			for(int y: x) {
				System.out.println("Value is: " + y);
				sum += y;
			}
		}
		System.out.println("Summation: " + sum);
	}
}