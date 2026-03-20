package rotated_sorted_array_33;

public class Optimized {

	public static void main(String[] args) {
		
		int[] nums = {26, 31, 34, 39, 1, 12, 13, 19};
		int target = 12;
        int low = 0;
        int high = nums.length-1;

        // after this loop terminates, the index of the lowest value in the array or in other words, the rotating point will be stored in the variable low.
        while (low<high) {
            int mid = (low+high)/2;

            if (nums[mid] > nums[high])
                low = mid+1;
            else high = mid;
        }
        int rot = low;

        // next just find out whether the target lies to the left of rotation or the right. simply perform search in that half.

        if (target > nums[nums.length-1]) // target either lies in the left half or target not in array
            System.out.println(binSearch(nums, 0, rot-1, target));
            
        else // target either lies in the right half or target now in array
            System.out.println(binSearch(nums, low, nums.length-1, target));
    }

    public static int binSearch(int[] nums, int low, int high, int target) {
        int mid;

        while (low<=high) {
            mid = (low+high)/2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }


}
