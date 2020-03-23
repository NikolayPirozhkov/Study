import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UTestSwap {
    private Main main;
    @Test
    void swapTest() {
        SwapInt tester = new SwapInt();
        int i = 0, j = 4;
        int [] anArray = {0,1,2,3,4};
        assertTrue(tester.swap(i, j, anArray), "Element " + i + " and " + j + "Exist in " + Arrays.toString(anArray));
        assertArrayEquals(anArray, new int[]{4, 1, 2, 3, 0},"Swap element " + i + " and " + j + " equals " + Arrays.toString(anArray));
        j = 12;
        assertFalse(tester.swap(i,j,anArray), "Element " + i + " and " + j + "NOT Exist in " + Arrays.toString(anArray));
    }
}