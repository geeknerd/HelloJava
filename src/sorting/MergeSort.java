package sorting;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MergeSort {
public static int[] helper;
	
	public void startMergeSort(int arr[]){
		this.helper = new int[arr.length];
		this.mergeSort(arr, 0, arr.length-1);
	}
	public void mergeSort(int arr[], int low, int high){
		if(low < high){
			int mid = (low + high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}
	
	public void merge(int arr[], int low, int mid, int high){
		for (int i = low; i <= high; i ++){
			helper[i] = arr[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high){
			if(helper[i] < helper[j]){
				arr[k] = helper[i];
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		while (i <= mid){
			arr[k] = helper[i];
			k++;
			i++;
		}
	}
	
	@Test
	public void mergeSortTest(){
		int[] input = {46,24,18,29,134,23,45,67,100,25,25,46};
		MergeSort ms = new MergeSort();
		ms.startMergeSort(input);
		for(int i = 0; i < input.length-1; i++){
			if(input[i] > input[i+1]){
				fail("Not sorted");
			}
		}
		assertTrue(true);
	}
	
}
