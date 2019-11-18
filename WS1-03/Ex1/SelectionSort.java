public class SelectionSort{
	
	
	public static int[] selectionSort(int[] numbers) {
		int a ;
		int min;
		int b = 0;
		/**
		 * the parameters in constructor are as same as our filed variables.
		 * 
		 * @param a
		 *            is tmp of numbers[i].
		 * @param min
		 *            is min.
		 * @param b
		 *            is tmp of j.
		 */
		for(int i = 0; i<numbers.length ;i++) {
			
			min = numbers[i];
			for(int j = i; j<numbers.length ;j++) {
				
				if(numbers[j]<=min) {
					min = numbers[j];
					b = j;
				}
				
			}
			a = numbers[i];
			numbers[i] = numbers[b];
			numbers[b] = a;
			
		}
		/**
		 * use SelectionSort to sort numbers.
		 * 
		 * @return array.
		 */
		/*for (int element : number) {
		System.out.print(element + " ");
		}*/
		//System.out.println("最小值索引值為"+number);
		 return numbers;
		 
	}
	
	
} 