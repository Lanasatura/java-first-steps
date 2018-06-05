class ExBubbleStr {
	public static void main(String args[]) {
		String str[] = {"A", "7", " ", "out", "of", "space", "to", "find", "another", "race"};
		String t;
		int a, b;
		int size;
		
		size = str.length; //количество элементов в массиве
		
		System.out.println("Original array is: ");
		for(int i = 0; i < size; i++)
			System.out.print(" " + str[i]);
		System.out.println();
		
		//алгоритм пузырьковой сортировки
		for(a = 1; a < size; a++)
			for(b = size - 1; b >= a; b--) {
				if( str[b-1].compareTo(str[b]) > 0 ) {  //если порядок следования не соблюдается, меняем соседние элементы местами
					t = str[b-1];
					str[b-1] = str[b];
					str[b] = t;
				}
			}
			
		System.out.println("Sorted array is: ");
		for(int i = 0; i < size; i++)
			System.out.print(" " + str[i]);
		System.out.println();
	}
}