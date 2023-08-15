//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int left = 0, top = 0, down=r-1, right=c-1;
        ArrayList<Integer> list = new ArrayList();
        while(top<=down && left<=right){

            // top
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            // right
            for(int i=top;i<=down;i++){
                list.add(matrix[i][right]);
            }
            right--;

            // down
            if(top<=down){
                for(int i=right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
            }

            // left
            if(left<=right){
                for(int i=down;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
