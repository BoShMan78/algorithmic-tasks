// https://leetcode.com/problems/design-hashset/submissions/1413565476/

class MyHashSet {

   private List<Integer> integerList;
   
    public MyHashSet() {
        this.integerList = new ArrayList<>();
    }

    public void add(int key) {
        if (!integerList.contains(key)) {
            integerList.add(key);
        }
    }

    public void remove(int key) {
        integerList.remove((Integer) key);
    }

    public boolean contains(int key) {
        return integerList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
