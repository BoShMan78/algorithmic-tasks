// https://leetcode.com/problems/implement-stack-using-queues/submissions/1353149713/

class MyStack {
Stack<Integer> customStack = new Stack<>();

    public MyStack() {
    }

    public void push(int x) {
        customStack.push(x);
    }

    public int pop() {
        return customStack.pop();
    }

    public int top() {
        return customStack.peek();

    }

    public boolean empty() {
        return customStack.isEmpty();
    }
}
