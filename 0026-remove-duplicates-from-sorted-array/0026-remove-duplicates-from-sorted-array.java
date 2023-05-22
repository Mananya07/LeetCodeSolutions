class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int j=1;
        int n = nums.length;
        for (j=1; j<n; j++)
        {
            if (nums[j] != nums[i])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}