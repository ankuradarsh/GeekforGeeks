//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.leftElement(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long leftElement(long arr[], long n)
    {
        // Your code goes here  
        // Arrays.sort(arr);
        boolean flag = true;
        int left=0, right=(int)n-1;
        for(int i=0;i<n-1;i++){
            if(flag){
                arr[right]=0;
                right--;
                flag=false;
            } else {
                arr[left]=0;
                left++;
                flag=true;
            }
        }
        long num=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) num=arr[i];
        }
        return num;
    }
}