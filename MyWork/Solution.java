/*
import java.util.Arrays; 

class Solution {
  public static int[] twoSum(int sum) {
       int[] number = new int[sum];
       number[0] = 3;
       number[1] = 7;
       number[2] = 6;
       number[3] = 4;
       number[4] = 8;

		for (int count = 0; count < number.length; count++) {
			
		}
		return number;
		
     
    }


public static void main(String[] args) {

System.out.println(Arrays.toString(twoSum(5))); 	

}

}
*/

//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 


import java.util.Arrays; 

class Solution {
  public static int[] twoSum(int sum) {
       int[] number = {2, 7, 11, 15};
       int target = 0;
       		
     		for (int count = 0; count < number.length; count++) {
     		sum = number[0] + number[1];
       	sum += target; 
			
		}
		return number[count];
		
     
    }


public static void main(String[] args) {

System.out.println(Arrays.toString(twoSum(5))); 	

}

}
