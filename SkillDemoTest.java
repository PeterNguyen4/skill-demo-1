import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    @Test
    public void evenOddTest() {
        assertEquals(true, SkillDemo.checkEvenOrOdd(4));
    }
}
