package test4;
import org.junit.jupiter.api.Test;
import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

public class D4Test {

    @Test
    public void testQueueOperations() {
        Deque queue = new ArrayDeque();

        assertEquals(0, queue.size());

        queue.addLast("Анна");
        assertEquals(1, queue.size());
        assertEquals("Анна", queue.peekLast());

        queue.addLast("Петр");
        assertEquals(2, queue.size());
        assertEquals("Анна", queue.peekFirst());
        assertEquals("Петр", queue.peekLast());

        queue.addLast("Марина");
        assertEquals(3, queue.size());
        assertEquals("Анна", queue.peekFirst());
        assertEquals("Марина", queue.peekLast());

        String currentClient = (String) queue.pollFirst();
        assertEquals("Анна", currentClient);
        assertEquals(2, queue.size());
        assertEquals("Петр", queue.peekFirst());
        assertEquals("Марина", queue.peekLast());
    }
}

