//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int n)
    {
        // your code here
        // using moore voting algo.
        int count=0, candidates=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidates = a[i];
            }
            if(a[i]==candidates){
                count++;
            } else {
                count--;
            }
        }
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i] == candidates){
                flag++;
            }
        }
        if(flag > n/2) return candidates;
        else return -1;
    }
}