class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []array=new int[n];
        int x=0;
        int y=1;
        for(int i=0;i<n;i++){
        if(nums[i]>0)
        {
          array[x]=nums[i];
          x=x+2;
          }
          else{
              array[y]=nums[i];
              y=y+2;
          }
        }
        return array;
        
    }
}