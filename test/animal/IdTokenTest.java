package animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Takahiro on 2017/05/30.
 */
class IdTokenTest {
    private IdToken t;
    @BeforeEach
    void setUp() {
        t = new IdToken(0, "for");
    }

    @Test
    void isIdentifier() {
        assertTrue(t.isIdentifier());
    }

    @Test
    void getText() {
        assertEquals(t.getText(), "for");
    }

    @Test
    void getLineNumber() {
        assertEquals(t.getLineNumber(), 0);
    }

}