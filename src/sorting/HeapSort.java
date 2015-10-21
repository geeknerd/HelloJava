package sorting;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class HeapSort {

	public void heapSort(int arr[]){
		int count = arr.length;
		int end = count - 1;
		heapify(arr,count);
		while(end > 0){
			int temp = arr[end];
			arr[end]=arr[0];
			arr[0] = temp;
			siftDown(arr,0,end-1);
			end--;
		}
	}
	
	public void heapify(int arr[], int count){
		int start = (count - 2)/2;
		while (start >= 0){
			siftDown(arr,start,count-1);
			start--;
		}
	}
	
	public void siftDown(int arr[], int start, int end){
		int root = start;
		while ( root * 2 + 1 <= end) {
			int child = root * 2 + 1;
			if ( child + 1 <= end && arr[child+1] > arr[child]){
				child = child + 1;
			}
			if ( arr[child] > arr[root] ){
				int temp = arr[child];
				arr[child] = arr[root];
				arr[root] = temp;
				root = child;
			}else{
				return;
			}
		}
	}
	
	@Test
	public void TestHeapSort(){
		HeapSort hs = new HeapSort();
		int[] input = {46,24,18,29,134,23,45,67,100,25,25,46};
		hs.heapSort(input);
		for(int i = 0; i < input.length-1; i++){
			if(input[i] > input[i+1]){
				fail("Not sorted");
			}
		}
		assertTrue(true);
	}
}
