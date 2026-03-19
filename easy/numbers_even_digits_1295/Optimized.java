package numbers_even_digits_1295;

class SolutionOp {
    static int findNumbers(int[] nums) {
    	int numLength=0;
    	int evenDigitNos=0;
    	
    	for(int num : nums) {
    		numLength = (int) Math.log10(num) + 1;
    		if (numLength%2 == 0) {
    			evenDigitNos++;
    		}
    	}
    	
    	return evenDigitNos;
    }
}


public class Optimized {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		
		System.out.println(SolutionOp.findNumbers(nums));
	}

}
