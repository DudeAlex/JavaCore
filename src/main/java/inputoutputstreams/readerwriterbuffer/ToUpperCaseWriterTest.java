package inputoutputstreams.readerwriterbuffer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ToUpperCaseWriterTest {

    ToUpperCaseWriter writer;
    ByteArrayOutputStream baos;

    @BeforeEach
    public void setUp(){
        baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        writer = new ToUpperCaseWriter(osw);
    }



    @Test
    public void writeCharTestWithNonChar() {
        try {
            writer.write('1');
            writer.flush();
            String uppercase = baos.toString();
            assertEquals("1", uppercase);
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @ParameterizedTest
    @MethodSource ("provideCharPairs")

    public void writeTestWithChar(char firstChar, char secondChar) {

        try {
            writer.write(firstChar);
            writer.flush();
            String uppercase = baos.toString();
            assertEquals(String.valueOf(secondChar), uppercase);
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    static Stream<Object[]> provideCharPairs() {
        return Stream.of(
                new Object[] {'a', 'A'},
                new Object[] {'x', 'X'},
                new Object[] {'m', 'M'}
        );
    }
}

