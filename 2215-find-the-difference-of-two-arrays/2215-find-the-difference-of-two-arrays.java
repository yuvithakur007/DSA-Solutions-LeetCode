class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list= new ArrayList<>();;
       
        list.add(rk(nums1, nums2) );
        list.add(rk(nums2, nums1) );

        return list;   
    }
    public  List<Integer> rk(int[] nums1, int[] nums2){

        List<Integer> ar = new ArrayList<>();;;
        for(int i=0;i<nums1.length;i++){
            int f=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                if(!ar.contains(nums1[i])) //check duplicate numbers
                    ar.add(nums1[i]);
            }            
        }
        //check output
        // for(int k=0;k<ar.size();k++){
        //     System.out.print(ar.get(k)+" ");
        // }
        // System.out.println();

        return ar;
    }
}