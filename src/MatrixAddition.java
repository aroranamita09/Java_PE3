import java.util.Scanner;
import java.util.Arrays;
public class MatrixAddition {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of coumns");
        int c=sc.nextInt();
        int [][]arr=new int [r][c];
        for(int )

    }
    public []Integer addMatrix(Integer first[][],int p,int q)
    {
        int result[]=new int[q];
        for(int i=0;i<p;i++)

            for(int j=0;j<q;j++)
            {
                result=sum(first[i][j],first[i+1][j]);
            }

    }

    private int sum(Integer integer, Integer integer1) {
        Integer num=integer+integer1;
        return num;
    }
}

