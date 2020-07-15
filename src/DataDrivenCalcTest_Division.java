import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class DataDrivenCalcTest_Division {
    public int a, b;
    public float division;

    public DataDrivenCalcTest_Division(int a, int b, float division)
    {
        this.a = a;
        this.b = b;
        this.division = division;
    }

    @Parameters
    public static Collection<Object[]> calcValues()
    {
        return Arrays.asList (new Object [][] {{5, 6, (float) 5/6}, {6, 5, (float) 6/5}});
    }

    @Test
    public void divisionTest()
    {
        assertTrue ("Division Test", division == Calc.divide (a,b));
    }
}
