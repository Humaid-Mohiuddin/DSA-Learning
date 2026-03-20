package sqrt_of_x_69;

public class Optimized {

	public static void main(String[] args) {
		
		
	}
	
	public static int mySqrt(int x) {
		int mid, square;
		
		if (x<=2) {
			return x;
		}
		
		int low = 0;
		int high = x;
		
		while (low<=high) {
			mid = (low+high)/2;
			square = mid*mid;
			
			if (square == x)
				return mid;
			else if (square < x)
				low = mid+1;
			else
				high = mid-1;
			
		}
		return high;
    }

}
