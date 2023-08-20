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
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int first = first(arr, n, 0, n-1, x);
        if(first == -1) return 0;
        int last = last(arr, n, 0, n-1, x);
        return last-first+1;
    }
    int first(int arr[], int n, int left, int right, int x){
        while(left<=right){
            int mid = (left+right)/2;
            if((mid==0||arr[mid-1]<x) && arr[mid]==x){
                return mid;
            } else if(x>arr[mid]){
                left = mid+1;
            } else right = mid-1;
        }
        return -1;
    }
    
    int last(int arr[], int n, int left, int right, int x){
        while(left<=right){
            int mid = (left+right)/2;
            if((mid==n-1||x<arr[mid+1]) && arr[mid]==x){
                return mid;
            } else if(x<arr[mid]){
                right = mid-1;
            } else left = mid+1;
        }
        return -1;
    }
}