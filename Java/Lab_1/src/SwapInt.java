/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class SwapInt {
    boolean swap(int i, int j, int[] anArray){
        if(i <= anArray.length-1 && j <= anArray.length-1 && i >= 0 && j >= 0){
            int temp = anArray[i];
            anArray[i] = anArray[j];
            anArray[j] = temp;
            return true;
        }
        return false;
    }
}
