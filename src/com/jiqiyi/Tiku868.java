package com.jiqiyi;

class Tiku868 {
    public int binaryGap(int n) {
        int pre=-1,max=0;
        for(int i=0;i<32;i++){
            if(((1<<i)&n)!=0) {
                if(pre==-1){
                    pre = i;
                    continue;
                }
                max = Math.max(max,i-pre);
                pre = i;
            }
        }
        return max;
    }
}
