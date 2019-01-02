import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    @Test
        public void testwithinRange() throws Exception{
        String expectedValue="true true true";
        StudentMarks obj=new StudentMarks();
        int arr[]={50,30,10};
        assertEquals(expectedValue, obj.withinRange(arr, 3));
    }

}

