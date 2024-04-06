import Hurble.t1.Tyson1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
public class Test1 {

    @Test

    public void Tyson1() {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

        List expectedUniqueNumbers = new ArrayList();
        expectedUniqueNumbers.add(1);
        expectedUniqueNumbers.add(3);
        expectedUniqueNumbers.add(5);

        List uniqueNumbers = Tyson1.getUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, uniqueNumbers);
    }
}


