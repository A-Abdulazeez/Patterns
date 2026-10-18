import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonPatternTest {

    @Test
    public void testShouldReturnSameinstance() {
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();
        assertSame(s1,s2);
    }

}