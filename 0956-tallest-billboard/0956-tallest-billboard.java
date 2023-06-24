class Solution {
    public int tallestBillboard(int[] rods) {
        int n=rods.length;
        Arrays.sort(rods);
        HashMap<Integer,Integer> map=new HashMap<>();

        //Initialize the map value 

        map.put(0,0);
        for(int elem:rods){
            HashMap<Integer,Integer> NewMap=new HashMap<>(map);
          
    //Iterating the HashMap
   
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int dif=entry.getKey();
                int big=entry.getValue();
                int small=big-dif;

                
                NewMap.put((big+elem)-small,big+elem);
                NewMap.put( Math.abs((small+elem)-big),Math.max(Math.max(small+elem, big),NewMap.getOrDefault(Math.abs((small+elem)-big),0 )));
            }
    // updating the Map value with newMap
            map=NewMap;
        }
        return map.getOrDefault(0,0);
    }
}
// DC