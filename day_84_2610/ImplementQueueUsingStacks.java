// https://leetcode.com/problems/implement-queue-using-stacks/submissions/1434120569/

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> reverseStack;
    public MyQueue() {
        this.stack = new Stack<>();
        this.reverseStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        while (!stack.empty()) {
            reverseStack.push(stack.pop());
        }
        Integer pop = reverseStack.pop();
        while (!reverseStack.empty()) {
            stack.push(reverseStack.pop());
        }
        return pop;
    }

    public int peek() {
        while (!stack.empty()) {
            reverseStack.push(stack.pop());
        }
        Integer peek = reverseStack.peek();
        while (!reverseStack.empty()){
            stack.push(reverseStack.pop());
        }
        return peek;
    }

    public boolean empty() {
        return stack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
