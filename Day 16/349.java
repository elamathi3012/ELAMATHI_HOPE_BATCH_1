class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {  
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> re = new HashSet<>();
        for(int num : nums1){
            s1.add(num);
        }
        for(int nu : nums2){
            if(s1.contains(nu)){
            re.add(nu);}
        }
        int [] a = new int [re.size()];
        int i=0;
        for(int n : re){
            a[i++] =n;
        }return a;

        }
        }