package com.jiqiyi;

/**
 * 颜色分类
 */
public class Tiku75 {
    
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int num:nums){
            count[num]++;
        }
        int index = 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                nums[index++] = i;
            }
        }
    }

    /**
     * single pointer's solution
     * @param nums
     */
    public void sortColors_singlePointer(int[] nums){
        int headPtr = 0;
        int n = nums.length;
        // the first time to scan the array
        // move all 0 to the head's partition 
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                swap(nums,headPtr++,i);
            }
        }

        // the second time to scan the array
        // move all 1 to the head's partition
        for(int i=headPtr;i<n;i++){
            if(nums[i]==1){
                swap(nums,headPtr++,i);
            }
        }
    }

    /**
     * double pointer's solution
     * use p0 and p1
     * @param nums
     */
    public void sortColors_doublePointer(int[] nums){
        int ptr0=0,ptr1=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                swap(nums, i, ptr1++);
            }
            else if(nums[i]==0){
                if(ptr0<ptr1){
                    swap(nums, i, ptr0++);
                    swap(nums, i, ptr1++);
                }
                else{
                    swap(nums, i, ptr0++);
                    ptr1++;
                }
            }
        }
    }

    /**
     * another double pointer's solution
     * use p0 and p2
     * @param nums
     */
    public void sortColors_doublePointer1(int[] nums){
        int n = nums.length;
        int p0 = 0,p2=n-1;
        for(int i=0;i<n;i++){
            while(nums[i]==2 && p2>i){
                swap(nums, i, p2--);
            }
            if(nums[i]==0){
                swap(nums, i, p0++);
            }
        }
    }

    
    /**
     * swap the position of i,j element
     * @param nums
     * @param i
     * @param j
     */
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
