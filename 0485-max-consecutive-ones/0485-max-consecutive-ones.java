class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]!=0){
                    count=count+1;
                }
                else{
                    break;
                }

            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
}