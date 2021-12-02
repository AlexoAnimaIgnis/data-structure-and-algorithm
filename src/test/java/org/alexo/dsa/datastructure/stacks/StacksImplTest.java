package org.alexo.dsa.datastructure.stacks;

import  static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StacksImplTest {
    private StacksImpl stacks;

    @Before
    public void setup() {
        stacks = new StacksImpl();
    }

    @Test
    public void testPush() {
        int val = stacks.push(7);
        assertEquals(7, val);
    }
}
