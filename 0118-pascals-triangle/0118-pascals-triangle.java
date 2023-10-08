class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> pas=new ArrayList<>();
        pas.add(1);
        res.add(pas);
        for(int i=1;i<numRows;i++){
       List<Integer> prow=res.get(i-1);
       List<Integer> crow=new ArrayList<>();
       crow.add(1);
            for(int j=1;j<i;j++){
                crow.add(prow.get(j-1)+prow.get(j));
            }
            crow.add(1);
            res.add(crow);
        }
        return res;
         

    }
}