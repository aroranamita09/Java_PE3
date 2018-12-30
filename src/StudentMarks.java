import java.util.Scanner;

public class StudentMarks {
    public static void main(String args[]) {
        System.out.println("Enter the number of students");
        Scanner obj = new Scanner(System.in);
        int numOfStudents = obj.nextInt();
        System.out.println("Enter the grades of students");
        int[] stuGrades =  new int[numOfStudents];
        for(int i=0;i<numOfStudents)
        {
            stuGrades[i]=obj.nextInt();
        }
        withinRange(stuGrades,numOfStudents);

}
public String withinRange(int []grades,int numOfstudents)
    { for (int i = 0; i < numOfstudents; i++)
    {
        if (grades[i]>0 || grades[i] < 100)
            System.out.println("Within range");
    }
    try{
        withinRange(grades,numOfstudents);

    }
    catch( IllegalArgumentException e)
        {
        System.out.println("exception:"+e.getMessage());
    }
    finally{

    }

}
