package Hurble.t1;

//У вас есть список чисел, в котором некоторые числа встречаются более одного раза.
// Необходимо написать функцию, которая принимает этот список и возвращает новый список,
// в котором будут только уникальные числа из исходного списка, т.е. без повторений.
//Список:[1, 2, 3, 4, 2, 4 ,5]
//Пример:
//Исходный список: [1, 2, 3, 4, 2, 3, 5]
//Результат: [1, 4, 5]


import java.util.ArrayList;
import java.util.List;

public class Tyson1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        List<Integer> uniqueNumbers = getUniqueNumbers(numbers);
        System.out.println(uniqueNumbers);
    }
    public static List<Integer> getUniqueNumbers(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        List<Integer> duplicateNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number) && !duplicateNumbers.contains(number)) {
                uniqueNumbers.add(number);
            } else {
                duplicateNumbers.add(number);
            }
        }

        uniqueNumbers.removeAll(duplicateNumbers);
        return uniqueNumbers;
    }
}