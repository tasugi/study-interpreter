package animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Takahiro on 2017/05/30.
 */
class StrTokenTest {
    private StrToken t;

    @BeforeEach
    void setUp() {
        t = new StrToken(0, "hoge");
    }

    @Test
    void isString() {
        assertTrue(t.isString());
    }

    @Test
    void getText() {
        assertEquals(t.getText(), "hoge");
    }

    @Test
    void getLineNumber() {
        assertEquals(t.getLineNumber(), 0);
    }

}