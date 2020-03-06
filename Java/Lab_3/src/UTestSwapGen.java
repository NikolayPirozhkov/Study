
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
        System.out.println("TEST STARTED");
        Main tester = new Main();
        String [] testStringArr = {"hallo","World","f*king"};
        tester.swap(testStringArr,1,2);
        //tester.swap(testStringArr[0],1,2);
        List<String> testList = new ArrayList<>(Arrays.asList(testStringArr));
        tester.swap(testList,1,2);
        //tester.swap(testList.get(0),1,2);
        assertArrayEquals(testList.toArray(), new String [] {"hallo","World","f*king"},"start message == message after double swap");
        System.out.println("TEST FINISHED");
    }
}