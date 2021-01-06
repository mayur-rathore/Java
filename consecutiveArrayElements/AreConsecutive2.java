package consecutiveArrayElements;

// Time Complexity: O(n)
// Extra Space: O(1)
// It changes the original array and it works only if all numbers are positive. We can get the original array by adding an extra step though. 
// Instead of creating a new array, we modify the input array arr[] to keep track of visited elements.
// The idea is to traverse the array and for each index i (where 0 ≤ i < n), make arr[arr[i] – min]] as a negative value.
// If we see a negative value again then there is repetition.

public class AreConsecutive2 {
	
	boolean areConsecutive(int[] arr, int length) {
		
		int min = getMin(arr, length);	
		int max = getMax(arr, length);
		
		if( max-min+1 == length) {
				
			for(int i=0; i< length; i++){
				int j;
				
				if(arr[i] < 0)
					j = -arr[i] - min;
				else
					j = arr[i] - min;
				
				// if the value at index j is negative then there is repetition 
				if(arr[j] > 0)
					arr[j] = -arr[j];
				else
					return false;
			}
			// If we do not see a negative value then all elements are distinct
			return true;
		}
		
		return false;
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
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		AreConsecutive2 consecutive = new AreConsecutive2();
		int[] arr = {5,2,3,1,4,6};
		int length = arr.length;
		
		boolean result = consecutive.areConsecutive(arr, length);
		
		if(result)
			System.out.println("Array elements are consecutive");
		else
			System.out.println("Array elements are not areconsecutive");
	}
}