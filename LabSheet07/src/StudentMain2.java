import java.util.Scanner;

public class StudentMain2 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student id: ");
            String id = sc.nextLine();

            students[i].name = name;
            students[i].id = id;

            System.out.print("Enter homework score: ");
            int homeworkScore = sc.nextInt();
            students[i].doHomework(homeworkScore);

            System.out.print("Enter exam score: ");
            int examScore = sc.nextInt();
            students[i].takeExam(examScore);

            sc.nextLine();

            System.out.println();
        }
        for (int i = 0; i < students.length; i++) {
            students[i].showStatus();
            System.out.println("------------------------------");
        }
    }
}
