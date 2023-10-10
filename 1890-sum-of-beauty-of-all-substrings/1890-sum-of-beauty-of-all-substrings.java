class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int []f =new int[26];
            for(int j=i;j<s.length();j++){
                f[s.charAt(j)-'a']++;
                int res=beauty(f);
                sum=sum+res;
            }
        }
        return sum;
    }
    public int beauty(int [] f){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int k=0;k<f.length;k++){
        if(f[k]==0){
           continue;
        }
        min=Math.min(min,f[k]);
        max=Math.max(max,f[k]);
        
        }
        return max-min;
    }

}