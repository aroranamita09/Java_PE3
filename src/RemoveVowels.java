import java.util.Scanner;

public class RemoveVowels {
    public static void main(String args)
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

    }
    public void RemoveIntegers(String a)
    {
        char[]work=a.toCharArray();
        for(int i=0;i<work.length;i++)
        {
            if(work[i]=='a'||work[i]=='e'||work[i]=='i'||work[i]=='o'||work[i]=='u')
                work[i]=null;
        }
    }
}
