package monotonic;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] A = {1,2,2,3};
		
		System.out.println("Input: " + Arrays.toString(A));
		
		MonotonicArrayFunction solution = new MonotonicArrayFunction();
		
		System.out.println("Solution: " + solution.isMonotonic(A));
	}
}
