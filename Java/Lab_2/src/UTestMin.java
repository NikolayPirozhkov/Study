import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
class UTestMin {

    @Test
    void min() {
        MinOfThree tester = new MinOfThree();
        {
            int a = 0, b = 1, c = 2;
            assertEquals(tester.min(a, b, c), a);
        }
        {
            int a=5, b = 10, c = 1;
            assertEquals(tester.min(a, b, c), c);
        }
        {
            int a=5, b = 3, c = 15;
            assertEquals(tester.min(a, b, c), b);
        }
    }
}