package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntStackTest {
    private IntStack stack;

    @Before
    public void createEmptyStack() {
        stack = new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testIsFullOnFullStack(){
        for (int i=0; i<stack.getCapacity(); i++){
            stack.push(i);
        }
        assertTrue(stack.isFull());

    }

    @Test
    public void testIsFullOnNoneFullStack() {
        for (int i = 0; i < stack.getCapacity()-1; i++) {
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue(){
        stack.push(5);
        stack.push(11);
        assertEquals(11,stack.pop());
        assertEquals(5,stack.pop());

    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack(){

        stack.pop();

    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack(){

        for (int i=0; i<stack.getCapacity()+1; i++){
            stack.push(i);
        }

    }

    @Test
    public void testIsEmptyOnEmptyStack(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyOnNoneEmptyStack(){
        stack.push(11);
        assertFalse(stack.isEmpty());
    }

}
