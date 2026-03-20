package search_insert_position_35;

public class BruteForce {

	public static void main(String[] args) {
		int[] data = {1, 11, 111, 1111, 11111};
		int searchValue = 111;
		
		int low = 0;
		int high = data.length - 1;
		
		int mid = (low+high)/2;
		while (low<=high) {
			
			mid = (low+high)/2;
			
			if (data[mid] < searchValue) {
				low = mid+1;
			}
			
			else if (data[mid] > searchValue) {
				high = mid-1;
			}
			
			else {
				System.out.println(mid);
				return;
			}
			
		}
		
		if (searchValue > data[mid])
			System.out.println(mid+1);
        else
        	System.out.println(mid);

	}

}
