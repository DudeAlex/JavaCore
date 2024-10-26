package hausaufgabe.lektion16.schachbrett.chessaufgabe.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    public void testPush(){
        StackNichtErbt stack = new StackNichtErbt();
        assertTrue(stack.push(1));
    }

    @Test
    public void testPop(){
        StackNichtErbt stack = new StackNichtErbt();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }



}
