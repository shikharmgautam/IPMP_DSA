

// User function Template for Java

class Solution {
    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        int row0 =0, col0 =0;
        for(int i = 0; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j] == 1){
                    if(i==0) row0 =1 ;
                    if(j==0) col0=1;
                    mat[0][j] = 1;
                    mat[i][0] = 1;
                }
            }
        }
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(mat[i][0] == 1 || mat[0][j] == 1){
                    mat[i][j] =1;
                }
            }
        }
        if (row0==1){
            for(int i=0; i<c;i++){
                mat[0][i]=1;
            }
        }
        if(col0==1){
            for(int i=0; i<r;i++){
                mat[i][0] = 1;
            }
        }
    }
}