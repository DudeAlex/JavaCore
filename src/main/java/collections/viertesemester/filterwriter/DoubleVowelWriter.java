package collections.viertesemester.filterwriter;

import java.io.FilterWriter;
import java.io.IOException;

public class DoubleVowelWriter extends FilterWriter {

    public DoubleVowelWriter(java.io.Writer out) {
        super(out);
    }

    @Override
    public void write(int c) throws IOException {
        char ch = (char) c;
        out.write(ch);
        if (isVowel(ch)) {
            out.write(ch);
        }
    }

    private boolean isVowel(char ch) {
        return "AEIOUaeiouÄÖÜäöü".indexOf(ch) != -1;
    }
}
