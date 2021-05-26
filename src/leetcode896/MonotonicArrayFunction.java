package leetcode896;

public class MonotonicArrayFunction {
	public boolean isMonotonic(int[] A) {
		// if the length is 1, its not increasing or decreasing so true
		if (A.length == 1) {
			return true;
		}

		// length of the array
		int n = A.length;

		// increase is true when last element minus first element > 0
		boolean increase = (A[n - 1] - A[0]) > 0;

		// 1,3,2
		for (int i = 0; i < n - 1; i++) {
			// It will return false when the element next to each other is not
			// equal
			// If its increasing or decreasing, the != increase will never
			// happen
			if (A[i + 1] != A[i] && (A[i + 1] - A[i] > 0) != increase) {
				return false;
			}
		}

		return true;
	}

	// // Easier solution using true and false base on "And" or "Or"
	 public boolean isMonotonic2(int[] A) {
	 // increasing and decreasing is 1 by default
	 boolean increasing = true;
	 boolean decreasing = true;

	 for(int i = 1; i < A.length; i++){
	// // 1,2,3 since true and true will be true, otherwise 1 and 0 is false
	 increasing = increasing & A[i] >= A[i-1];

	// // 3,2,1 since true and true will be true, otherwise 1 and 0 is false
	 decreasing = decreasing & A[i] <= A[i-1];
	 }

	// // Since 0 or 1 and 1 or 0 is true, otherwise will be false
	 return increasing || decreasing;
	 }
}
