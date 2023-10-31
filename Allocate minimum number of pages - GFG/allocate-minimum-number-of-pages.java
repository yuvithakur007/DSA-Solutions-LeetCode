//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if(N<M){
            return -1;
        }
        int low=0;
        int high=0;
        
        for(int i=0; i<A.length; i++){
            
            if(A[i]>low){
                low= A[i];
            }
            
            high+= A[i];
        }
        
        int res=-1;
        
        while(low<=high){
            
            int mid= (low+high)/2;
            
            if(isAllocatable(A, mid, M)){
                res=mid;
                high= mid-1;
            }else{
                low= mid+1;
            }
            
        }
        
        return res;
    }
    
    public static boolean isAllocatable(int[] A, int mid, int M){
        
        int student=1;
        int sum=0;
        
        for(int i=0; i<A.length; i++){
            
            if(sum+A[i]> mid){
                student++;
                sum=A[i];
            }else{
                 sum+= A[i];
            }
            
           
        }
        
        return student<=M;
        
    }
};