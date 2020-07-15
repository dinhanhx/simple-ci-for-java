import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)

public class DataDrivenCalcTest_Subtract {
    public int a, b, subtraction;

    public DataDrivenCalcTest_Subtract(int a, int b, int subtraction)
    {
        this.a = a;
        this.b = b;
        this.subtraction = subtraction;
    }

    @Parameters
    public static Collection<Object[]> calcValues()
    {
        return Arrays.asList (new Object [][] {{5, 6, -1}, {6, 5, 1}});
    }

    @Test
    public void subtractionTest()
    {
        assertTrue ("Subtraction Test", subtraction == Calc.subtract (a,b));
    }
}
