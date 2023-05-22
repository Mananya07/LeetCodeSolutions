class Solution {
    public int[] runningSum(int[] nums) {
        int t = nums.length;
        int[] sumArray = new int[t];
        int sum = 0;
        for (int i=0; i<sumArray.length; i++){
            sum = sum+nums[i];
            sumArray[i] = sum;
        }
        return sumArray;
    }
}