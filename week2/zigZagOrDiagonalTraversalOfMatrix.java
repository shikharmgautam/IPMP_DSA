

//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {   
        int sum =0; 
        ArrayList<Integer> arr = new ArrayList<>();
      while (sum <= (2*N-2)){
        for(int j=sum<(N-1) ? sum : (N-1), i= sum-j; i+j == sum && i<N && j<N && i>=0 && j>=0; i++, j--){
            arr.add(A[i][j]);
        }    
        sum++;
      }
      return arr;
    }
}