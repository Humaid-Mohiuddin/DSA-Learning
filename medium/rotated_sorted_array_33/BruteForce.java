package rotated_sorted_array_33;

public class BruteForce {

	public static void main(String[] args) {
		
		int[] data = {4, 5, 6, 7, 0, 1, 2};
		int searchValue = 3;
		
		int foundFirst=-1, foundSecond=-1;
		
		int[] startEnd = findRotation(data);
		int startIndex = startEnd[0];
		int endIndex = startEnd[1];
		
		foundFirst = search(data, 0, endIndex, searchValue);
		foundSecond = search(data, startIndex, data.length-1, searchValue);
		
		if (foundFirst >=0) {
			System.out.println(foundFirst);
		}
		
		else if (foundSecond >=0)
			System.out.println(foundSecond);
		
		else
			System.out.println(-1);
	}
	
	public static int[] findRotation(int[] nums) {
		
		// startIndex holds the index of the lowest value in the array
		// endIndex holds the index of the highest value in the array
		int startIndex=0, endIndex=0;
		int size = nums.length;
		
		// using two pointers to see where the array is rotated 
		int lPtr=0, rPtr=size-1;
		
		for (lPtr=0; lPtr<size; lPtr++) {
			if (nums[lPtr] > nums[lPtr+1]) {
				endIndex = lPtr;
				startIndex = lPtr+1;
				break;
			}
			else if (nums[rPtr] < nums[rPtr-1]) {
				endIndex = rPtr-1;
				startIndex = rPtr;
				break;
			}
			rPtr--;
		}
		
		return new int[] {startIndex, endIndex};
	
	}
	
	public static int search(int[] nums, int low, int high, int target) {
        
		int mid;
		
		while (low<=high) {
			
			mid = low + (high-low)/2;
			
			if (nums[mid] < target) {
				low = mid+1;
			}
			
			else if (nums[mid] > target) {
				high = mid-1;
			}
			
			else {
				return mid;
			}
			
		}
		
		return -1;
		
    }

}
