class Solution {
    public double average(int[] salary) {
        // Arrays.sort(salary);
        // double sum=0;
        // int n=salary.length-2;
        // for(int i=1;i<salary.length-1; i++){
        //     sum =sum+salary[i];
        // }
        // return (sum/n);
        double max=Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum =0;
        for(int i=0;i<salary.length;i++){
            if(max<salary[i]) max=salary[i];
            if(min>salary[i]) min=salary[i];
            sum+=salary[i];
        }
        return (sum-(max+min))/(salary.length-2);
    }
}