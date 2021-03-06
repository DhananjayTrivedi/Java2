package Java.Data_Structures.Others;

import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[100];
		//Initializing the Array
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = i;
	    }
	    int index = 0;
	    Collections.shuffle(Arrays.asList(arr));
		
	    System.out.println(Arrays.toString(arr));
	    
	    //Selection Sort
	    for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int currentMinIndex = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < min){
					min = arr[j];
					currentMinIndex = j;
				}
			}
			int temp = arr[i];
			if (currentMinIndex != i){ 
				arr[currentMinIndex] = arr[i]; 
				arr[i] = min;
			}
	    }
	    System.out.println(Arrays.toString(arr));
	}
}