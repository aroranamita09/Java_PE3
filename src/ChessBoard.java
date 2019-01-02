/**Write a program to create a ChessBoard pattern with the help of multidimensional array, where WWrepresents white color and BB represents Black color.
 Output:
 My Chess Board
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|**/
public class ChessBoard {
    public String[][] pattern()
    {
        String str[][]=new String[8][8];
        for(int i=0;i<8;i++)
            for(int j=i;j<i;j++)
            {
                str[i][j]="WW|";
                str[i][j+1]="JJ|";
                System.out.println(str);
            }
    return str;
    }

}
