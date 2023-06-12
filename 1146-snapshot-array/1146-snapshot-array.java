class SnapshotArray {
    int siz = 0;
    int snap_id = -1;
    // Index->[value, snap_id]
    HashMap<Integer, List<int[]>> snap = new HashMap<>();

    public SnapshotArray(int length) {
        siz = length;
    }
    
    public void set(int index, int val) {
        int[] curr = new int[2];
        curr[0] = val;
        curr[1] = snap_id;
        if (snap.containsKey(index)){
            List<int[]> curr_ = snap.get(index);
            curr_.add(curr);
            snap.put(index, curr_);
        }
        else {
            List<int[]> lt = new ArrayList<>();
            int[] curr1 = new int[2];
            curr1[0]=0;
            curr1[1]=-1;
            lt.add(curr1);
            lt.add(curr);
            snap.put(index, lt);
        }
    }
    
    public int snap() {
        return ++snap_id;
    }
    
    public int get(int index, int snap_id) {
        if (snap.containsKey(index)) {
            System.out.println(index);
            int l=0, r=snap.get(index).size()-1;
            while (l<r) {
                int m = l + (r-l+1)/2;
                System.out.println(l+","+m+","+r);
                if (snap.get(index).get(m)[1] >= snap_id)
                    r = m-1;
                else
                    l = m;
            }
            return snap.get(index).get(l)[0];
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */