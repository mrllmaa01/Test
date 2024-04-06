import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Queue;
import java.util.LinkedList;

public class Test3 {
    @Test
    public void testQueueOperations() {

        // Инициализируем очередь и добавляем элементы
        Queue queue = new LinkedList();
        queue.add("Анна");
        queue.add("Петр");
        queue.add("Мария");
        queue.add("Иван");

        // Проверяем, что первый человек в очереди правильный
        assertEquals("Анна", queue.peek());

        // Удаляем первого человека и добавляем нового
        queue.poll();
        queue.add("Ольга");

        // Проверяем, что новый первый человек в очереди правильный
        assertEquals("Петр", queue.peek());
    }
}
