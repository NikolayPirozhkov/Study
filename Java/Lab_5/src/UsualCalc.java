/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class UsualCalc implements ICalculator {
    @Override
    public int summ(int x, int y) {
        long sum = (long) x + (long) y;
        if(sum > Integer.MAX_VALUE){
            throw new RuntimeException("Возвращаемое значение больше int");
        }
        return x+y;
    }
}
