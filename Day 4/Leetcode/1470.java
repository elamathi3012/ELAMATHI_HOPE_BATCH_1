class Solution {
    public int[] shuffle(int[] nums, int n) {
     int u [] = new int[n];
     int v [] = new int [n];
     for(int i =0;i<n;i++ ){
        u[i]=nums[i];
     }int j =0;
     for(int i =n;i<nums.length;i++){
      v[j++]=nums[i];
     } int g =0; int  k =0;
     for(int i =0;i<nums.length;i++){
        if(i%2==0) nums[i] = u[k++];
        else{
        nums[i] = v[g++];}
     }return nums;
    }
}