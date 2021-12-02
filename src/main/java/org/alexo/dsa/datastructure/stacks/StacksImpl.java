package org.alexo.dsa.datastructure.stacks;

import java.util.Stack;

/**
 * Stack's Basic Operation Implementation
 *
 * push
 * pop
 * peek
 */
public class StacksImpl {

    public int push(int value) {
        Stack<Integer> stack = new Stack<>();
        return stack.push(value);
    }

    public int pop(Stack<Integer> stack) {
        return stack.pop();
    }

}
