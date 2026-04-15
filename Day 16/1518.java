class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {int sum=0;
       int c=0;
       while(numBottles>=numExchange){
        c+=numExchange;
        numBottles-=numExchange;
        numBottles++;
       }
       return c+numBottles;
    }
}