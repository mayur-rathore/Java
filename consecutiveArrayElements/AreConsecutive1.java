package consecutiveArrayElements;

// Time Complexity: O(n)
// Extra Space: O(n)
// To check if all elements are distinct, we can create a visited[] array of size n

public class AreConsecutive1 {
	
	boolean areConsecutive(int[] arr, int len) {
		
		if(len < 1)
			return false;
		
		/* 1) Get the minimum element in array */
		int min = getMin(arr, len);
		
		/* 2) Get the maximum element in array */
		int max= getMax(arr, len);
		
		/* 3) max - min + 1 is equal to len,  then only check all elements */
		if( max-min+1 == len) {
			/* Create a temp array to hold visited flag of all elements. 
            Note that, calloc is used here so that all values are initialized as false */
			
			boolean[] visited = new boolean[len];
			for(int i=0; i<len; i++) {
				/* If we see an element again, then return false */
				if(visited[arr[i]-min] != false)
					return false;
			
				/* If visited first time, then mark the element as visited */
				visited[arr[i]-min] = true;
			}
			
			/* If all elements occur once, then return true */
			return true;
		}
		
		return false;	// if (max - min  + 1 != n)
	}
	
	
	/* UTILITY FUNCTIONS */
	int getMin(int[] arr, int length) {
		
		int min = arr[0];
		for(int i=0; i<length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	int getMax(int[] arr, int length) {
		
		int max = arr[0];
		for(int i=0; i<length; i++) {
			if(arr[i]> max)
				max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		AreConsecutive1 consecutive = new AreConsecutive1();
		int[] arr = {5,4,2,3,1,6};
		int length = arr.length;
	
		if(consecutive.areConsecutive(arr, length))
			System.out.println("Array elements are consecutive");
		else 
			System.out.println("Array elements are not consecutive");
	}
}
