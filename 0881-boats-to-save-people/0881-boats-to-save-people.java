class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left= 0;
        int right= people.length-1;
        int count= 0;
        Arrays.sort(people);
        while(left<=right){
            int sum=people[left]+people[right];
            if(sum<=limit){                
                left++;
                right--;
            }else{
                right--;
            }
            count++;
        }
        return count;        
    }
}