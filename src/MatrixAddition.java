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
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }

    }
    public Integer[] addMatrix(Integer first[],Integer second[],int r,int c)
    {
        Integer result[]=new Integer[r];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                result[i]=first[i][j]+first[i+1][j];
            }return result;
    }
}

/**
 private int sum(Integer integer, Integer integer1) {
 Integer num=integer+integer1;
 return num;
 }**/