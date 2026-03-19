package median_sorted_arrays_4;

public class BruteForce {
	
	static double medianOfSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] mergedArray = new int[m+n];
		
		int ptr1 = 0;
		int ptr2 = 0;
		
		for (int i=0; i<(m+n); i++) {
			
			if (ptr1==m) {
				for (int j=ptr2; j<n; j++) {
					mergedArray[i] = nums2[j];
					i++;
				}
				break;
			}
			else if (ptr2==n) {
				for (int j=ptr1; j<m; j++) {
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
		if ((m+n)%2 == 0) {
			int high = (m+n)/2;
			return (double)(mergedArray[high]+mergedArray[high-1])/2;
		}
		else {
			int low = (int) (m+n)/2;
			return (double)(mergedArray[low]+mergedArray[low+1])/2;
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] ar1 = {1, 3, 5};
		int[] ar2 = {2, 4, 6, 7};
		System.out.println(medianOfSortedArrays(ar1, ar2));

	}

}
