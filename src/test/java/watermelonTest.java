import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class watermelonTest {

    @Test
    public void test_case1() {
        String data = "100\n";  // even number in range(can be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Water.waterMelon(), "YES");
    }

    @Test
    public void test_case2() {
        String data = "2\n";  // check for number 2 (can't be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Water.waterMelon(), "NO");
    }

    @Test
    public void test_case3() {
        String data = "110\n";  // range must be smaller than or equal 100
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Water.waterMelon(), "out of range");// checking the upper range of n
    }

    @Test
    public void test_case4() {
        String data = "12\n";  // even number in range(can be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Water.waterMelon(), "YES");
    }
    @Test
    public void test_case5() {
        String data = "0\n";  // range must be bigger than or equal 1
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Water.waterMelon(), "out of range");// checking the lower range of n
    }

    @Test
    public void test_case6() {
        String data = "11\n";  // odd number in range(can't be divided)
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Water.waterMelon(), "NO");
    }


}





