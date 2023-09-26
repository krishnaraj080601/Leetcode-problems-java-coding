class Solution {
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
        int x=nums.length;
        int []arr=new int[x];
        int j=0;
        for(int i=x-k;i<x;i++){
            arr[j++]=nums[i];
        }
        for(int h=0;h<x-k;h++){
            arr[j++]=nums[h];
        }
        for(int l=0;l<x;l++){
            nums[l]=arr[l];
        }
    }
}