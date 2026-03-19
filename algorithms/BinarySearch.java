package algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5};
		int searchFor = 4;
		
		
		BinarySearch.binSearch(data, searchFor);
	}
	
	
	static int binSearch(int[] data, int searchValue) {
		
		int low = 0;
		int high = data.length - 1;
		
		while (low<=high) {
			
			int mid = (low+high)/2;
			
			if (data[mid] < searchValue) {
				low = mid+1;
			}
			
			else if (data[mid] > searchValue) {
				high = mid-1;
			}
			
			else {
				System.out.println("Value found at index: "+mid);
				return 0;
			}
			
		}
		
		System.out.println("No record in data for give value.");
		return 0;
		
	}

}
