

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> arr= new ArrayList<>();
        int offset =0, forward = 1;
        for(int k=1, i=0, j=0; k<=n*m; k++){
            arr.add(mat[i][j]);
            if(forward == 1){
                if(j >= m-1-offset){
                    if(i >= n-1-offset){
                        forward =0;
                        j--;
                    }
                    else
                        i++;
                }
                else{
                    j++;
                }
            }
            else{
                if(j <= offset){

                   if(j == offset) offset++;
                    if(i <= offset){
                        forward = 1;
                        j++;
                    }
                    else{
                        i--;
                    }
                }
                else{
                    j--;
                }
            }
        }
        return arr;
    }
}