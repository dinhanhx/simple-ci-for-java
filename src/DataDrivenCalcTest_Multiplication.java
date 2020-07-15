import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class DataDrivenCalcTest_Multiplication {
    public int a, b, multiplication;

    public DataDrivenCalcTest_Multiplication (int a, int b, int multiplication)
    {
        this.a = a;
        this.b = b;
        this.multiplication = multiplication;
    }

    @Parameters
    public static Collection<Object[]> calcValues()
    {
        return Arrays.asList (new Object [][] {{5, 6, 30}, {6, 5, 30}});
    }

    @Test
    public void multiplicationTest()
    {
        assertTrue ("Subtraction Test", multiplication == Calc.multiply (a,b));
    }
}
