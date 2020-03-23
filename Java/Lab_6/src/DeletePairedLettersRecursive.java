import java.util.ArrayDeque;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class DeletePairedLettersRecursive implements IDeletePairedLetters{

    public String delete(String inputString){
        char[] chars = inputString.toCharArray();
        int wordLength = inputString.length();
        for (int i = 0; i < chars.length; i++) {
            int nextCharIndex = i + 1;
            if (nextCharIndex < wordLength && chars[i] == chars[nextCharIndex]) {
                return delete(inputString.substring(0, i) + inputString.substring(nextCharIndex + 1, wordLength));
            }
        }
        return inputString;
    }
}
