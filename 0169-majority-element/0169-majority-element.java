class Solution {
    public int majorityElement(int[] nums)
     {
         int x=nums.length;
         Arrays.sort(nums);
         for(int i=0;i<x;i++){
             int count=1;
             for(int j=i+1;j<x;j++){
                 if(nums[i]==nums[j]){
                     count=count+1;
                 }
             }
             if(count>x/2){
                 return nums[i];
             }
         }
     return -1;
    }
}