package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingAlgo {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {46,24,18,29,134,23,45,67,100,25,25,46};
		SortingAlgo sa = new SortingAlgo();
		System.out.println("Initial Array:");
		sa.printArr(input);
		System.out.println("Bubble Sort:");
		sa.bubbleSort(input);
		sa.printArr(input);
		input = new int[]{46,24,18,29,134,23,45,67,100,25,25,46};
		System.out.println("Initial Array:");
		sa.printArr(input);
		System.out.println("Selection Sort:");
		sa.selectionSort(input);
		sa.printArr(input);
		input = new int[]{46,24,18,29,134,23,45,67,100,25,25,46};
		System.out.println("Initial Array:");
		sa.printArr(input);
		System.out.println("Insertion Sort:");
		sa.insertionSort(input);
		sa.printArr(input);
		input = new int[]{46,24,18,29,134,23,45,67,100,25,25,46};
		System.out.println("Initial Array:");
		sa.printArr(input);
		System.out.println("Quick Sort:");
		sa.quickSort(input,0,input.length-1);
		sa.printArr(input);
	}
	*/
	

	
	public void insertionSort(int arr[]){
		int n = arr.length;
		for ( int i = 1; i < n; i++){
			int value = arr[i];
			int j = i;
			while (j > 0 && arr[j-1] > value){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = value;
		}
	}

	public void selectionSort(int arr[]){
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n-1; i++){
			int min = i;
			for(int j = i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public void bubbleSort(int arr[]){
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++){
			for (int j = 1; j < n-i; j++){
				if(arr[j]<arr[j-1]){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public void printArr(int arr[]){
		System.out.print("Sorted: ");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
