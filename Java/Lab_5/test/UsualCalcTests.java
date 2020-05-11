import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Lab_5
 */
public class UsualCalcTests {
    @Test
    void errorTest(){
        UsualCalc calc = new UsualCalc();

        Throwable throwable = assertThrows(RuntimeException.class,() ->{
            calc.summ(Integer.MAX_VALUE,Integer.MAX_VALUE);
        });
        assertNotNull(throwable.getMessage());
    }
    @Test
    void rightTest(){
        UsualCalc calc = new UsualCalc();
        try{
            calc.summ(Integer.MAX_VALUE/3,Integer.MAX_VALUE/2);
        }catch (RuntimeException exception){
            assertNull(exception.getMessage());
        }
    }

}
