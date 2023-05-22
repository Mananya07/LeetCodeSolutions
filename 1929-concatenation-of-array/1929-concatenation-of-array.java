class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = 2*(nums.length);
        int[] answer = new int[len];
        
        for (int i=0; i<answer.length; i++){
            if (i<nums.length){
                answer[i] = nums[i];
            }
            else{
                answer[i] = nums[i-nums.length];
            }
        }
        return answer;
    }
}