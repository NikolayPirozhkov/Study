import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
class UTestMin {

    @Test
    void min() {
        Main tester = new Main();
        int a = 0, b = 1, c = 2;
        assertEquals(tester.min(a, b, c), a);
        System.out.println("Test Start");
    }
}