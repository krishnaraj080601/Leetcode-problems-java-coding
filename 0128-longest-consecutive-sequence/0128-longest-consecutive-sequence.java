class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0){
        return 0;
    }
        Arrays.sort(nums);
        int count=0;
        int d=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
        else if(nums[i]+1!=nums[i+1]){
            count=0;
        }
        else{
            count++;
            d=Math.max(d,count);
            
        }
        }
        
        return d+1;
    }
}