package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int n = unsortedArray.length;
	    int temp;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-1;j++){
	            if(unsortedArray[j] > unsortedArray[j+1]){
	                temp = unsortedArray[j];
	                unsortedArray[j] = unsortedArray[j+1];
	                unsortedArray[j+1] = temp;
	            }
	        }
	    }
	    return unsortedArray;
		}
	}
