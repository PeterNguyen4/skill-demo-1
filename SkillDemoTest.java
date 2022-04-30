import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    @Test
    public void evenOddTest() {
        assertEquals(false, SkillDemo.checkEvenOrOdd(4));
    }
}
