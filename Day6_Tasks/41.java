
import java.util.HashMap;

class Solution {
    public int firstMissingPositive(int[] nums) {
       HashMap<Integer,Integer> h = new HashMap<>();
       for(int i =0;i<nums.length;i++){
        h.put(nums[i],1);
       }
       for(int counter=1;counter<=Math.pow(10,5)+1;counter++){
       if(!h.containsKey(counter)){
                    return counter;
                }
        
    }return -1;
}}