package animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Takahiro on 2017/05/30.
 */
class NumTokenTest {
    private NumToken t;

    @BeforeEach
    void setUp() {
        t = new NumToken(0, 1);
    }

    @Test
    void isNumber() {
        assertTrue(t.isNumber());
    }

    @Test
    void getNumber() {
        assertEquals(t.getNumber(), 1);
    }

    @Test
    void getText() {
        assertEquals(t.getText(), "1");
    }

    @Test
    void getLineNumber() {
        assertEquals(t.getLineNumber(), 0);
    }

}