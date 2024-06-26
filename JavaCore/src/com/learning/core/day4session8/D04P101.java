package com.learning.core.day4session8;

public class D04P101 {
	
	static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; 
        int i = (low - 1); 
        
        
        for (int j = low; j < high; j++) {
            
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
   
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    // Utility function to print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10, 7, 8, 9, 1, 5};
	        int n = arr.length;
	        
	        System.out.println("Original array:");
	        printArray(arr);
	        
	        quickSort(arr, 0, n - 1);
	        
	        System.out.println("Sorted array:");
	        printArray(arr);

	}

}
