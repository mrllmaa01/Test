import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;


public class z5test {

    @Test
    public void testAverageGradeCalculation() {
        Map<String, Double> gradesMap = new HashMap<>();
        gradesMap.put("Алексей", 87.5);
        gradesMap.put("Ирина", 92.0);
        gradesMap.put("Павел", 78.3);
        gradesMap.put("Ольга", 85.6);
        gradesMap.put("Елена", 90.2);

        double expectedAverage = (87.5 + 92.0 + 78.3 + 85.6 + 90.2) / 5.0;

        double sum = 0.0;
        for (double grade : gradesMap.values()) {
            sum += grade;
        }
        double actualAverage = sum / gradesMap.size();

        assertEquals(expectedAverage, actualAverage, 0.0001); // Проверка, что ожидаемое среднее значение равно фактическому с отклонением 0.0001
    }
}

