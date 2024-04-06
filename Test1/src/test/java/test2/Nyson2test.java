package test2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class Nyson2test {

    @Test
    public void testUniqueNumbers() {
        int[] numbers = {5, 2, 3, 5, 7, 8, 2, 10, 3, 5};

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        expectedUniqueNumbers.add(2);
        expectedUniqueNumbers.add(3);
        expectedUniqueNumbers.add(5);
        expectedUniqueNumbers.add(7);
        expectedUniqueNumbers.add(8);
        expectedUniqueNumbers.add(10);

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        assertEquals(expectedUniqueNumbers, uniqueNumbers);
    }
}
