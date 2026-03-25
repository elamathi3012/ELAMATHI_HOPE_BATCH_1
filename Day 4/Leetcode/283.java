class Solution {
    public void moveZeroes(int[] nums) { int[] arr1 = new int[nums.length];
    int[]arr2 = new int[nums.length]; int j=0,m=0;
    for(int i =0;i<nums.length;i++){
        if(nums[i]!=0){
           arr1[j++] = nums[i];
        }
        if(nums[i]==0){
            arr2[m++]=nums[i];
        }
    } int i =0;j=0;
    while(j<arr1.length){
        nums[i++]=arr1[j++];
    }j=0;
   while(j<arr2.length&&i<nums.length){
    nums[i++]=arr2[j++];
   } 
    }
    }
