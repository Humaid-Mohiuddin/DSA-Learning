package median_sorted_arrays_4;

import java.util.Arrays;

public class Optimized {
	
	static double medianOfSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] mergedArray = new int[m+n];
		
		int ptr1 = 0;
		int ptr2 = 0;
		
		boolean even = (m+n)%2 == 0;
		int limit = (even? (m+n)/2:(int)(m+n)/2);
		
		for (int i=0; i<=limit; i++) {
			
			if (ptr1==m) {
				for (int j=ptr2; i<=limit; j++) {
					mergedArray[i] = nums2[j];
					i++;
				}
				break;
			}
			else if (ptr2==n) {
				for (int j=ptr1; i<=limit; j++) {
					mergedArray[i] = nums1[j];
					i++;
				}
				break;
			}
			
			if (nums1[ptr1] > nums2[ptr2]) {
				mergedArray[i] =  nums2[ptr2];
				ptr2++;
			}
			else {
				mergedArray[i] =  nums1[ptr1];
				ptr1++;
			}
		}
		
		if (even) {
			return (double) (mergedArray[limit]+mergedArray[limit-1])/2;
		}
		else {
			return (double) mergedArray[limit];
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] ar1 = {1, 2};
		int[] ar2 = {3, 4};
		System.out.println(medianOfSortedArrays(ar1, ar2));

	}

}
