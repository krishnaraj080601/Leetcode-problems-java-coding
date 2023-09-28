class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int[][]b=new int[m][m];
        for(int i=0;i<m;i++){
            int k=0;
            for(int j=m-1;j>=0 && k<m;j--){
                b[i][k]=matrix[j][i];
                k++;
            }
        
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=b[i][j];
            }
        }

        
    }
}