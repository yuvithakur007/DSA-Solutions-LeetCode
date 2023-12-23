class Solution {
    public boolean isPathCrossing(String path) {
    int x=0;
    int y=0;
    HashMap<String,Boolean>mp=new HashMap<>();
    String temp=x+","+y;
    mp.put(temp,true);
        
    for(int i=0;i<path.length();i++){
    if(path.charAt(i)=='N')y+=1;
    else if(path.charAt(i)=='S')y-=1;
    else if(path.charAt(i)=='E')x+=1;
    else x-=1;
        
    temp=x+","+y;
    if(mp.containsKey(temp))return true;
    mp.put(temp,true);
    }
    return false;
    }
}