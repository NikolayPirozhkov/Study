import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
class DeletePairedLettersDequeTest {

    @Test

    void deleteStack() {
        DeletePairedLettersDeque deletePairedLettersDeque = new DeletePairedLettersDeque();

        assertEquals(deletePairedLettersDeque.delete("aab"),"b","'aab' -> 'b'");
        assertEquals(deletePairedLettersDeque.delete("aabb"),"", "'aabb' -> ''");
        assertEquals(deletePairedLettersDeque.delete("abfbaf"),"abfbaf", "'abfbaf' -> 'abfbaf'");
        assertEquals(deletePairedLettersDeque.delete("abccbaf"),"f", "'abccbaf -> 'f'");
    }
}