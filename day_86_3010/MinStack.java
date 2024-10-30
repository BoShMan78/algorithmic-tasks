// https://leetcode.com/problems/min-stack/submissions/1438178157/

class MinStack {
    Node headNode;
    Node tailNode;
    Integer minValue;

    private class Node {
        int value;
        Node nextNode;
        Node prevNode;
        
        public Node(int value) {
            this.value = value;
        }
    }

    public MinStack() {
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if (headNode == null) {
            headNode = newNode;
            tailNode = headNode;
            minValue = val;
            return;
        }
        tailNode.nextNode = newNode;
        newNode.prevNode = tailNode;
        tailNode = newNode;
        if (minValue > val) {
            minValue = val;
        }
    }

    public void pop() {
        if (headNode.nextNode == null) {
            tailNode = null;
            headNode = null;
            minValue = null;
            return;
        }
        if (minValue == tailNode.value) {
            Node currentNode = headNode;
            minValue = currentNode.value;
            do  {
                if (minValue > currentNode.value) {
                    minValue = currentNode.value;
                }
                currentNode = currentNode.nextNode;
            } while (currentNode.nextNode != null);
        }
        tailNode = tailNode.prevNode;
        tailNode.nextNode = null;
    }

    public int top() {
        return tailNode.value;
    }

    public int getMin() {
        return minValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
