// https://leetcode.com/problems/design-hashmap/submissions/1410642146/

class MyHashMap {
     private int[] map;
    public MyHashMap() {
        map=new int[1000001];
        Arrays.fill(map,-1);
    }
    
    public void put(int key, int value) {
        map[key]=value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key]=-1;
    }
}