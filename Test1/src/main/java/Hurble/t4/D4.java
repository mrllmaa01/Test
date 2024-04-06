package Hurble.t4;
//Задача: "Реализуйте программу для супермаркета, где люди стоят в очереди к кассе.
// Используйте коллекцию Deque для моделирования очереди. Когда человек приходит в магазин, он добавляется в конец очереди .
// Когда касса освобождается, первый в очереди человек обслуживается и удаляется из очереди .
// Программа должна выводить информацию о том, кто обслуживается в данный момент, и общее количество людей в очереди."
//При старте программы:
//В очереди нет клиентов.
//Первый клиент приходит в магазин: Анна
//Второй клиент приходит в магазин: Петр
//Третий клиент приходит в магазин: Марина
//Касса освобождается и обслуживается первый в очереди клиент: Анна обслуживается.
import java.util.ArrayDeque;
import java.util.Deque;

public class D4 {

    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();

        System.out.println("В очереди нет клиентов.");

        // Добавляем клиентов в очередь
        queue.addLast("Анна");
        System.out.println("Первый клиент приходит в магазин:");
        printQueueInfo(queue);

        queue.addLast("Петр");
        System.out.println("Второй клиент приходит в магазин:");
        printQueueInfo(queue);

        queue.addLast("Марина");
        System.out.println("Третий клиент приходит в магазин:");
        printQueueInfo(queue);

        // Обслуживаем клиентов
        String currentClient = queue.pollFirst();
        if (currentClient != null) {
            System.out.println("\n" + currentClient + " обслуживается.");
            printQueueInfo(queue);
        }
    }

    private static void printQueueInfo(Deque<String> queue) {
        System.out.println("Количество людей в очереди: " + queue.size());
        System.out.println("Текущая очередь: " + queue);
        System.out.println();
    }
}


