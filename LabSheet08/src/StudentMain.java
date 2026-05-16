import java.util.Scanner;

public class StudentMain {
    public static void showInfo(Student st) {
        System.out.println("Name : " + st.getName() +
                "\nYear : " + st.getStudyYear() +
                "\nScore: " + st.getScore() +
                "\nGrade: " + st.getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        student.setName(name);

        System.out.print("Enter student year: ");
        int year = sc.nextInt();
        student.setStudyYear(year);

        System.out.print("Enter mid-term score: ");
        int MidtermScore = sc.nextInt();
        student.addPoint(MidtermScore);

        System.out.print("Enter final score: ");
        int FinalScore = sc.nextInt();
        student.addPoint(FinalScore);

        System.out.println("------------------------------");
        showInfo(student);
    }
}
