import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    @Test
    {
        public void testwithinRange() throws Exception{
        String expectedValue="Within range";
        StudentMarks obj=new StudentMarks();
        String actualValue=obj.withinRange([50,20,30], 3);
        assertEquals(expectedValue, actualValue);
    }


    }

}

