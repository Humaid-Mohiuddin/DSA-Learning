//https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array

package richest_customer_wealth_1672;

class Solution {
    static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        int sum=0;
        
        for (int row=0; row<accounts.length; row++) {
        	sum=0;
        	for (int col=0; col<accounts[row].length; col++) {
        		sum+=accounts[row][col];
        	}
        	if (sum>maxWealth) {
        		maxWealth = sum;
        	}
        }
        
        return maxWealth;
    }
}

public class BruteForce {

	public static void main(String[] args) {
		int[][] accounts = {
				{1, 5},
				{7, 3},
				{3, 5}
		};
		
		System.out.println(Solution.maximumWealth(accounts));
	}

}
