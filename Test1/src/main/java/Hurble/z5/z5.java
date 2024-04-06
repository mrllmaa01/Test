package Hurble.z5;
//У вас есть коллекция Map, где ключами являются имена студентов, а значениями - их оценки за тест.
// Необходимо создать метод, который будет находить средний балл всех студентов.
//Алексей, 87.5
//Ирина, 92.0
//Павел, 78.3
//Ольга, 85.6
//Елена, 90.2

import java.util.HashMap;
import java.util.Map;

public class z5 {
    public static void main(String[] args) {
        Map<String, Double> gradesMap = new HashMap<>();
        gradesMap.put("Алексей", 87.5);
        gradesMap.put("Ирина", 92.0);
        gradesMap.put("Павел", 78.3);
        gradesMap.put("Ольга", 85.6);
        gradesMap.put("Елена", 90.2);

        double sum = 0.0;
        for (double grade : gradesMap.values()) {
            sum += grade;
        }

        double average = sum / gradesMap.size();
        System.out.println("Средний балл всех студентов: " + average);
    }
}

