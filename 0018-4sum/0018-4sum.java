class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int g=nums.length-1;
                while(k<g){
                    long sum=(long) nums[i]+nums[j]+nums[k]+nums[g];
                    if(sum<target){k++;}
                    else if(sum>target)
                    {g--;}
                     else{
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[g]);
                        res.add(temp);
                        k++;
                        g--;
                        while(k<g && nums[k]==nums[k-1]){k++;}
                        while(k<g && nums[g]==nums[g+1]){g--;}
                    }
                    
                }
            }
        }
        return res;
    }
}