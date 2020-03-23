/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class MinOfThree {
    public int min(int a, int b, int c){

        //return a > b ? (a > c ? a : c) : b;
        return Math.min(Math.min(a, b), c);
    }
}
