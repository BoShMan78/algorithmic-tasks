// https://leetcode.com/problems/kth-largest-element-in-a-stream/submissions/1367776974/

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class KthLargest {
    int k;
    List<Integer> stream;

    public KthLargest(int k, int[] nums) {
        stream = new ArrayList<>();
        this.k = k;
        for (int num : nums) {
            stream.add(num);
        }
        Collections.sort(stream);
    }

    public int add(int val) {
        int index = getIndex(val);
        stream.add(index, val);
        return stream.get(stream.size() - k);
    }

    public int getIndex(int val) {
        int left = 0;
        int right = stream.size() - 1;
        while(left <= right){
            int middle = (right + left) / 2;
            if (stream.get(middle) == val) {
                return middle;
            }
            if (stream.get(middle) > val) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
