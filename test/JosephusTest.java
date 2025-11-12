import static org.junit.Assert.*;
import org.junit.Test;

public class JosephusTest {

    @Test
    public void testBasic() {
        assertEquals(4, Josephus.josephus(7, 3));
        assertEquals(3, Josephus.josephus(5, 2));
        assertEquals(10, Josephus.josephus(10, 1));
    }

    @Test
    public void testHidden() {
        assertEquals(1, Josephus.josephus(1, 5));
        assertEquals(4, Josephus.josephus(6, 7));
        assertEquals(28, Josephus.josephus(40, 3));
        assertEquals(5, Josephus.josephus(10, 2));
    }
}
