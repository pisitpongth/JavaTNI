import javax.swing.*;

public class StudentMain3 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        String passStudent = "";
        String failStudent = "";

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            String id = JOptionPane.showInputDialog("Enter student id " + (i + 1));
            String name = JOptionPane.showInputDialog("Enter student name " + (i + 1));

            students[i].id = id;
            students[i].name = name;

            int homeworkScore = Integer.parseInt(JOptionPane.showInputDialog("Enter homework's score:"));
            students[i].doHomework(homeworkScore);

            int examScore = Integer.parseInt(JOptionPane.showInputDialog("Enter exam's score:"));
            students[i].takeExam(examScore);

            if (students[i].getResult().equals("PASS")) {
                passStudent += "- " + name + "\n";
            } else {
                failStudent += "- " + name + "\n";
            }
        }
        System.out.println("\nList of PASS students");
        System.out.println(passStudent);
        System.out.println("\nList of FAIL students");
        System.out.println(failStudent);
    }
}
