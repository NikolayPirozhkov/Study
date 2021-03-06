
import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

        import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
class UTestSwapGen {

    @org.junit.jupiter.api.Test
    void swap() {
        TSwap tester = new TSwap();
        String [] testStringArr = {"hallo","World","Beautiful"};
        tester.swap(testStringArr,1,2);
        List<String> testList = new ArrayList<>(Arrays.asList(testStringArr));
        tester.swap(testList,1,2);
        assertArrayEquals(testList.toArray(), new String [] {"hallo","World","Beautiful"},"start message == message after double swap");
    }
}