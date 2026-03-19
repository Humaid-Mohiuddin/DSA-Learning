package median_sorted_arrays_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

class Test {
    static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] newSortedArray = new int[m+n];
        HashMap<String, Array> map = new HashMap<>();

        int currentHigh = 0;
        String highArray = "";
        int highIndex = 0;
        int temp=0;
        int ptr =1;
        
        for (int i=0; i<(m+n); i++) {
        	
//          if one of the arrays reaches the end --> append rest of the elements
        	if (ptr == m) {
        		ptr-=1;
        		while(ptr<n) {
        			newSortedArray[i] = nums2[ptr];
        			ptr++;
        		}
        		break;
        	}
        	else if (ptr == n) {
        		ptr-=1;
        		while(ptr<m) {
        			newSortedArray[i] = nums1[ptr];
        			ptr++;
        		}
        		break;
        	}
        	
        	
        	if (highArray == "nums1") {
        		if (nums2[ptr] > currentHigh) {
        			newSortedArray[i] = currentHigh;
        			currentHigh = nums2[ptr];
        			temp = ptr;
        			ptr = highIndex+1;
        			highArray = "nums2";
        			highIndex = temp;
        		}
        		else {
        			newSortedArray[i] = nums2[ptr];
        			ptr++;
        		}
        		
        	}
        	
        	else if (highArray == "nums2") {
        		if (nums1[ptr] > currentHigh) {
        			newSortedArray[i] = currentHigh;
        			currentHigh = nums1[ptr];
        			temp = ptr;
        			ptr = highIndex+1;
        			highArray = "nums1";
        			highIndex = temp;
        		}
        		else {
        			newSortedArray[i] = nums1[ptr];
        			ptr++;
        		}
        	}
        	
        	else if (highArray == "") {
        		if (nums1[0] > nums2[0]) {
        			newSortedArray[0] = nums2[0];
        			currentHigh = nums1[0];
        			highArray = "nums1";
        			highIndex = 0;
        		}
        		else {
        			newSortedArray[0] = nums1[0];
        			currentHigh = nums2[0];
        			highArray = "nums2";
        			highIndex = 0;
        		}
        	}
        	
        }
        
        System.out.println(Arrays.toString(newSortedArray));
    }
    
    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 7, 8};
        int[] ar2 = {2, 4, 6};
        findMedianSortedArrays(ar1, ar2);
    }
}