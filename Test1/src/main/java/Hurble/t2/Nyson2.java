package Hurble.t2;
// У вас есть список чисел. Найдите все уникальные числа в этом списке и сохраните их в коллекции Set.
// Входной список чисел: [5, 2, 3, 5, 7, 8, 2, 10, 3, 5]
import java.util.HashSet;
import java.util.Set;


public class Nyson2 {
        public static void main(String[] args) {
            int[] numbers = {5, 2, 3, 5, 7, 8, 2, 10, 3, 5};

            Set<Integer> uniqueNumbers = new HashSet<>();
            for (int num : numbers) {
                uniqueNumbers.add(num);
            }

            System.out.println("Уникальные числа в списке:");
            for (int uniqueNum : uniqueNumbers) {
                System.out.println(uniqueNum);
            }
        }
    }

