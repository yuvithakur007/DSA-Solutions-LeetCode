//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int x=0;
        int y=0;
        int l=a.length+b.length;
        int arr[]=new int[l];
        double ans=0;
        for(int i=0;i<l;i++){
            if(x<a.length){
                arr[i]=a[x];
                x++;
            }else{
                arr[i]=b[y];
                y++;
            }
        }
        Arrays.sort(arr);
        if(l%2==0){
            ans=(arr[l/2]+arr[l/2-1]);
            return ans/2;
        }
        return ans=arr[l/2];
    }
}