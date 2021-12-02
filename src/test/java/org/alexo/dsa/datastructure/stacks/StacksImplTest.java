package org.alexo.dsa.datastructure.stacks;

import  static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class StacksImplTest {
    private StacksImpl stacksImpl;

    @Before
    public void setup() {
        stacksImpl = new StacksImpl();
    }

    @Test
    public void testPush() {
        int val = stacksImpl.push(7);
        assertEquals(7, val);
    }

    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stacksImpl.pop(stack));
    }
}
