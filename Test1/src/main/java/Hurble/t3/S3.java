package Hurble.t3;
//Задача: Разработать программу для управления очередью в больнице.
// В очереди находятся пациенты, сначала добавляются следующие пациенты: Анна, Петр, Мария и Иван.
// Программа должна вывести на экран первого пациента в очереди.
// Далее программа должна удалить первого пациента из очереди и добавить в конец очереди нового пациента - Ольга.
// Затем программа должна вывести на экран нового первого пациента в очереди


import java.util.LinkedList;
import java.util.Queue;
public class S3 {
        public static void main(String[] args) {
            Queue<String> queue = new LinkedList<>();

            queue.add("Анна");
            queue.add("Петр");
            queue.add("Мария");
            queue.add("Иван");

            System.out.println("Первый человек в очереди: " + queue.peek());

            queue.poll();

            queue.add("Ольга");

            System.out.println("Новый первый человек в очереди: " + queue.peek());
        }
    }
