package sqrt_of_x_69;

public class BruteForce {
	
	public static void main(String[] args) {
		System.out.println(mySqrt(5));
	}
	
	public static int mySqrt(int x) {
		if (x == 1) {
			return 1;
		}

        for (long i=0; i<=x; i++) {
        	if ((i*i) > x) {
        		return (int) (i-1);
        	}
        }
        return 0;
    }

}
