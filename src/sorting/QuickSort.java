package sorting;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class QuickSort {
	
	public void quickSort(int arr[], int low, int high){
		int index = partition(arr, low, high);
		if (low < index - 1) {
			quickSort(arr, low, index-1);
		}
		if (high > index){
			quickSort(arr, index, high);
		}
	}
	
	public int partition(int arr[], int low, int high){
		int i = low;
		int temp;
		int j = high;
		int pivot = arr[(low+high)/2];
		while ( i <= j ) {
			while (arr[i] < pivot){
				i++;
			}
			while (arr[j] > pivot){
				j--;
			}
			if (i <= j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	@Test
	public void suickSortTest(){
		int[] input = {46,24,18,29,134,23,45,67,100,25,25,46};
		QuickSort qs = new QuickSort();
		qs.quickSort(input,0,input.length-1);
		for(int i = 0; i < input.length-1; i++){
			if(input[i] > input[i+1]){
				fail("Not sorted");
			}
		}
		assertTrue(true);
	}
}
