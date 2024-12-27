/*Complexity Analysis

Time complexity: O(n 
2
 ).
For each element, we try to find its complement by looping through the rest of the array which takes O(n) time. Therefore, the time complexity is O(n 
2
 ).

Space complexity: O(1).
The space required does not depend on the size of the input array, so only constant space is used. */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Loop through each element in the array starting from the next element
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of the two elements is equal to the target, return the indices
                if (nums[j] == target - nums[i]) {
                    // Return the indices of the two elements
                    return new int[] { i, j };
                }
            }
        }
        // If no valid pair is found, return an empty array instead of null
        return new int[] {};
    }

    public static void main(String[] args){
        //create a new instance of the Solution class
        Solution s = new Solution();
        //define the array of numbers
        int[] nums = {2, 7, 11, 15};
        //define the target number
        int target = 9;
        //call the twoSum method and pass the array and target number
        int[] result = s.twoSum(nums, target);
        //print the result
        System.out.println(result[0] + " " + result[1]);
    }
}

