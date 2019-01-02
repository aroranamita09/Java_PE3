import java.util.Scanner;

/**
 * Create a class called StudentMarks,
 * which prompts user for the number of students,
 * reads it from the keyboard,
 * and saves it in an int variable called numOfStudents.
 * It then prompts user for the grades of each of the students
 * and saves them in an int array called stuGrades.
 * Your program shall check that the grade is between 0 and 100
 * else has to trow an error message.
 */
public class StudentMarks {
    public static void main(String args[]) {
        System.out.println("Enter the number of students");
        Scanner obj = new Scanner(System.in);
        int numOfStudents = obj.nextInt();
        System.out.println("Enter the grades of each student");
        int[] stuGrades =  new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++)
        {
            stuGrades[i]=obj.nextInt();
        }
        System.out.println(withinRange(stuGrades,numOfStudents));

}
public static Boolean withinRange(int []grades,int numOfstudents) {
    for (int i = 0; i < numOfstudents; i++) {
        if (grades[i] > 0 || grades[i] < 100)
            return true;
            //System.out.println("Within range");

        }return false;
    }
}

