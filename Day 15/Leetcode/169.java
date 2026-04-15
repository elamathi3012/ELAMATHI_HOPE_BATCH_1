class Solution {
    public int majorityElement(int[] nums) {
    //   int count = 0,max = Integer.MIN_VALUE;int maxval=0;
    //   if(nums.length==1){
    //     return nums[0];
    //   }
    //   for(int i =0;i<nums.length-1;i++){count =0;
    //     for(int j=0;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             count++;
    //         }if(count>max){
    //                    max = count;
    //                    maxval=nums[i];
    //         }
    //     }
    //   }return maxval;
    
    int n=nums[0];
    int cnt=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==n)
        {
            cnt++;
        }
        else
        {
            cnt--;
        }

        if(cnt==0)
        {
            n=nums[i];
            cnt=1;
        }
    }
    return n;
    }
}