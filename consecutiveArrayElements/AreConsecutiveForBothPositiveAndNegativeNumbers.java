package consecutiveArrayElements;

// Time Complexity : O(n) 
// Auxiliary Space : O(1)
// An important assumption here is elements are distinct.
// Find the sum of the array.
// If given array elements are consecutive that means they are in AP. So, find min element i.e. first term of AP then 
// calculate ap_sum = n/2 * [2a +(n-1)*d] where d = 1. So, ap_sum = n/2 * [2a +(n-1)]
// Compare both sums. Print Yes if equal, else No. 

public class AreConsecutiveForBothPositiveAndNegativeNumbers {
	
	boolean areConsecutive(int[] arr, int n) {
		
		int arr_sum = 0;
		
		// Calculate given array sum
		for(int i=0; i< n; i++) {
			arr_sum += arr[i];
		}
		
		// Find minimum element in array
		int first_term = Integer.MAX_VALUE;
		for(int j=0; j< n; j++) {
			if(arr[j] < first_term)
				first_term = arr[j];
		}
		
		// Calculate AP sum
		int ap_sum = (n * (2 * first_term + (n-1) * 1) / 2) ;
		
		// Compare both sums and return
		return ap_sum == arr_sum;
					
	}
	
	public static void main(String[] args) {
		
		AreConsecutiveForBothPositiveAndNegativeNumbers consecutive = new AreConsecutiveForBothPositiveAndNegativeNumbers();
		int[] arr = { 2, 1, 0, -3, -1, -2 };
		int length = arr.length;
		
		boolean result = consecutive.areConsecutive(arr, length);
		
		if(result == true)
			System.out.println("Array elements are consecutive");
		else
			System.out.println("Array elements are not areconsecutive");	 
	}
}
