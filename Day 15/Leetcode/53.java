class Solution {
    public int maxSubArray(int[] nums) {
        int s =0, max = nums[0];
        for(int i =0;i<nums.length;i++){
            s  = s+nums[i];
            max = Math.max(s,max);
            if(s<0)s=0;
        }return max;
    }
}