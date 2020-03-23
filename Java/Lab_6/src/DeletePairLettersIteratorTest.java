import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
class DeletePairLettersIteratorTest {

    @Test
    void deletePairFromString() {
            DeletePairLettersIterator deletePairLettersIterator = new DeletePairLettersIterator();
            assertEquals(deletePairLettersIterator.delete("aab"),"b","'aab' -> 'b'");
            assertEquals(deletePairLettersIterator.delete("aabb"),"", "'aabb' -> ''");
            assertEquals(deletePairLettersIterator.delete("abfbaf"),"abfbaf", "'abfbaf' -> 'abfbaf'");
            assertEquals(deletePairLettersIterator.delete("abccbaf"),"f", "'abccbaf -> 'f'");
    }
}