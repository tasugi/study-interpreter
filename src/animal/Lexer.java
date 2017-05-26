package animal;

import java.io.Reader;
import java.io.LineNumberReader;

public class Lexer {
    private boolean hasMore;
    private LineNumberReader reader;

    public Lexer(Reader r){
        hasMore = true;
        reader = new LineNumberReader(r);
    }
}
