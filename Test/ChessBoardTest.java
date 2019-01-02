import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void testpattern() throws Exception
    {
        ChessBoard obj=new ChessBoard();
        String expected="WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                " BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                " WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                " BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                " WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                " BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                " WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                " BB|WW|BB|WW|BB|WW|BB|WW|";
        assertEquals("expected",obj.pattern());
    }

}