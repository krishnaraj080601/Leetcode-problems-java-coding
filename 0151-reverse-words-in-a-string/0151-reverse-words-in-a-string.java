class Solution {
    public String reverseWords(String s) {
        String []s2=s.split(" ");
        StringBuilder s1=new StringBuilder();
        for(int i=s2.length-1;i>=0;i--){
            if(s2[i]!=""){
            s1.append(s2[i]);
            s1.append(" ");
            }
        }
        s1.setLength(s1.length()-1);
        return s1.toString();
    }
}