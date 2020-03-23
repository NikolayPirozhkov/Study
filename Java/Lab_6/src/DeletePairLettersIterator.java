import java.util.Arrays;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class DeletePairLettersIterator implements IDeletePairedLetters {
    private char[] elements;
    private int tail;
    public String delete(String inputString){
        elements = new char[inputString.length()];
        tail = 0;
        for(int i = 0; i < inputString.length(); i++){
            addIfNotPaired(inputString.charAt(i));
        }
        return new String(Arrays.copyOfRange(elements,0, tail));
    }

    private void addIfNotPaired(char c){
        if(tail == 0){
            elements[tail] = c;
            tail++;
        } else if(elements[tail-1] == c){
            tail--;
        } else {
            elements[tail] = c;
            tail++;
        }
    }
}
