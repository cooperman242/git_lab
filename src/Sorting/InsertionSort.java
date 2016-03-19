package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
		int v = array[i];
		int j = i-1;
		while (v < array[j] && j >= 0) {
			array[j+1] = array[j];
			array[j] = v;
			j--;
		}
		
	}
    return array;
  }
		
		
	
}
