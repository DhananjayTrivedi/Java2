package Java_Helper_Codes;

public class AnalysingTimeForSearching {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		int key = 77777777;
		int[] arr = new int[99999999];
		for(int i = 0;i<99999999;i++){
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key){
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time for LINEAR Search "+( endTime - startTime ));
		binarySearch(arr,key);
	}

	private static int binarySearch(int[] list, int key) {
		int low = 0; 
		long endTime;
		int high = list.length - 1;
		long startTime = System.currentTimeMillis();
		while (high >= low){			 
			int mid = (low + high) / 2;
			if (key < list[mid]) 
				high = mid-1;
			else if (key == list[mid]){
				endTime = System.currentTimeMillis();
				System.out.println("Time for BINARY Search "+( endTime - startTime ));
				return mid;
			}
			else
				low = mid + 1;
		}
		return -low - 1;
	}

}
