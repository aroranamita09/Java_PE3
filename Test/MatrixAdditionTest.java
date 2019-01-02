import org.junit.Test;

import static org.junit.Assert.*;
/**Write a program to compute the addition of two matrix,
 * Read the number of rows and columns as input,
 * also the values of each matrix
 Output:
 Input number of rows of matrix: 3
 Input number of columns of matrix: 2
 Input elements of first matrix: 1 2 3 4 5 6
 Input the elements of second matrix: 9 8 7 6 5 4
 Sum of the matrices:-
 10        10
 10        10
 10        10 **/
public class MatrixAdditionTest {
    @Test
    public static void testAddMatrix() throws Exception
    {
        MatrixAddition obj=new MatrixAddition();
        Integer expectedValue[]={10,10,10,10,10,10};
        Integer arr[]={1,2,3,4,5,6};
         Integer arra[]={9,8,7,6,5,4};

         assertEquals(expectedValue,obj.addMatrix(arr,arra,2,6));
    }

}