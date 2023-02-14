package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
private IntStack stack;
    @Test
    public void testNewStackIsNotFull() {
        stack= new IntStack();

        assertFalse(stack.isFull());
    }

}
