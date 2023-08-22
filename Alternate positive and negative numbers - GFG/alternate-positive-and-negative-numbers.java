//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positive = new ArrayList();
        ArrayList<Integer> negative = new ArrayList();
        for(int i=0;i<n;i++){
            if(arr[i]<0) negative.add(arr[i]);
            else positive.add(arr[i]);
        }
        int i=0, j=0, k=0;
        boolean flag=true;
        while(i<positive.size() || j<negative.size()){
            if(i!=positive.size() && flag){
                arr[k] = positive.get(i);
                i++;
                k++;
                flag = false;
            }
            if(i==positive.size()) flag = false;
            if(j!=negative.size() && !flag){
                arr[k] = negative.get(j);
                j++;
                k++;
                flag = true;
            }
            if(j==negative.size()) flag = true;
        }
    }
}