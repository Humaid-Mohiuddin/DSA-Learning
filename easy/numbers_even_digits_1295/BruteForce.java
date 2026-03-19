//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array

package numbers_even_digits_1295;


class Solution {
    static int findNumbers(int[] nums) {
    	int counter;
    	int evenDigitNos=0;
    	
    	for (int num : nums) {
    		counter = 0;
    		while (num != 0) {    			
    			num = Math.floorDiv(num, 10);
    			counter++;
    		}
    		if (counter%2 == 0) {
    			evenDigitNos++;
    		}
    		
    	}
    	
    	return evenDigitNos;
    }
}

public class BruteForce {

	public static void main(String[] args) {
		int[] nums = {555,901,482,1771};
		
		System.out.println(Solution.findNumbers(nums));
	}

}

