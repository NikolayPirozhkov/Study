import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
//""aab"" -> ""b"", ""aabb"" -> """", ""abfbaf"" -> ""abfbaf”, ""abccbaf"" -> ""f""
class DeletePairedLettersRecursiveTest {

    @org.junit.jupiter.api.Test
    void delete() {
        DeletePairedLettersRecursive deletePairedLettersRecursive = new DeletePairedLettersRecursive();
        assertEquals(deletePairedLettersRecursive.delete("aab"),"b","'aab' -> 'b'");
        assertEquals(deletePairedLettersRecursive.delete("aabb"),"", "'aabb' -> ''");
        assertEquals(deletePairedLettersRecursive.delete("abfbaf"),"abfbaf", "'abfbaf' -> 'abfbaf'");
        assertEquals(deletePairedLettersRecursive.delete("abccbaf"),"f", "'abccbaf -> 'f'");
    }
}