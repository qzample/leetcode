package com.jiqiyi;

class Tiku11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0,j=n-1,max=0;
        while(i<j){
            int area = Math.min(height[i],height[j])*(j-i);
            max = area>max?area:max;
            if(height[i]<height[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return max;
    }

    /**
     * the second time to practice
     */
    public int maxArea2(int[] height) {
        int n = height.length;
        int i=0,j=n-1,max=0;
        while(i<j){
            int area = Math.min(height[i], height[j])*(j-i);
            max = area>max?area:max;
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
