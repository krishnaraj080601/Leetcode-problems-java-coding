class Solution {
    public int countPrimes(int n) {
        boolean countPrime[]=new boolean[n+1];
        for(int i=2;i<=n;i++){
            countPrime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(countPrime[i]==true){
            for(int j=2*i;j<=n;j=j+i){
                countPrime[j]=false;
            }
        }
    }
    int count=0;
    for(int i=0;i<n;i++){
        if(countPrime[i]==true){
            count++;
        }
    }
    return count;
    }
}