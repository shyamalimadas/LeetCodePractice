/* Two Sum solution to learn from
- Need to remember that you can iterate with multiple iterators
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //first defined the int array that we will return, at the moment it is set to null
        int[] result = null;
        //define for loop to loop over the contents in num
        for (int i = 0; i < nums.length; i++){
            //while i is less than the lengh of the array
            while(i<nums.length){
                //if the current number and the number 1 ahead in the array's sum is equal to the target
                if((nums[i]+nums[i+1])==target){
                    //assign first as the first number
                    int first = nums[i];
                    //assign second as the second number
                    int second = nums[i+1];
                    //fit these numbers into the result array made before
                    result = new int[]{first, second};
                }
            }
        }
        //return the result array
        return result;
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


