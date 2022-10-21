import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    int floors;

    @Before
    public void setUp() {
        floors = 163;
    }

    @Test
    public void testCountIterations() {
        int result = 41;
        Assert.assertEquals(result, Main.countIterations(floors));
        System.out.println("Expected :" + result);
        System.out.println("Actual :" + Main.countIterations(floors));
    }
}
