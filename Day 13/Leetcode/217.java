class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count =0;
    Arrays.sort(nums);
        for(int i =0;i+1<nums.length;i++){
                
                if(nums[i]==nums[i+1]){count =1;
                break;}
             } if(count ==0  ) return false;
               else return true;
        
    }
}