package com.jiqiyi;

class Tiku6061 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int num1 = total/cost1;
        long sum = 0;
        for(int i=0;i<=num1;i++){
            if(total-(i*cost1)==0){
                sum+=1;
                continue;
            }
            sum += (total-(i*cost1))/cost2 + 1;
        }
        return sum;
    }    
}
