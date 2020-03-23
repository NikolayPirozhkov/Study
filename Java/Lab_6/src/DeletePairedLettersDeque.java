import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class DeletePairedLettersDeque implements IDeletePairedLetters {
    @Override
    public String delete(String inputString) {
        ArrayDeque<Character> stringToDeque = new ArrayDeque<Character>();
        for(int i = 0; i < inputString.length(); i++){
            if(stringToDeque.isEmpty()) {
                stringToDeque.push(inputString.charAt(i));
            } else if(stringToDeque.peek() == inputString.charAt(i)){
                stringToDeque.pop();
            } else{
                stringToDeque.push(inputString.charAt(i));
            }
        }
        StringBuilder stringBuilder = new StringBuilder(stringToDeque.size());
        while (!stringToDeque.isEmpty()){
            stringBuilder.append(stringToDeque.pollLast());
        }

        return stringBuilder.toString();
    }
}
