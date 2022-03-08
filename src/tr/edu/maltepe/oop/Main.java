package tr.edu.maltepe.oop;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.firstName = "Ecem";
        firstStudent.lastName = "Kuralay";
        firstStudent.studentNo = 190704028;
        firstStudent.learns();
        firstStudent.studies();

        Student secondStudent = new Student();
        secondStudent.firstName = "Nur";
        secondStudent.lastName = "Karakaya";
        secondStudent.studentNo = 200704006;


        Student thirdStudent = new Student();
        thirdStudent.firstName = "Yusuf";
        thirdStudent.lastName = "Akbulut";
        thirdStudent.studentNo = 190304033;


        Professor firstProfessor = new Professor();
        firstProfessor.FirstName = "Ensar";
        firstProfessor.LastName = "GÜL";
        firstProfessor.teaches();
        firstProfessor.help();

        Professor secondProfessor = new Professor();
        secondProfessor.FirstName = "Raif";
        secondProfessor.LastName = "ÖNVURAL";

        System.out.println("PROFESSORS:");
        System.out.println("             ");
        System.out.println(firstProfessor.FirstName);
        System.out.println(firstProfessor.LastName);
        System.out.println("                     ");
        System.out.println(secondProfessor.FirstName);
        System.out.println(secondProfessor.LastName);
        System.out.println("                     ");
        System.out.println("STUDENTS:");
        System.out.println("                      ");
        System.out.println(firstStudent.firstName);
        System.out.println(firstStudent.lastName);
        System.out.println(firstStudent.studentNo);
        System.out.println("                     ");
        System.out.println(secondStudent.firstName);
        System.out.println(secondStudent.lastName);
        System.out.println(secondStudent.studentNo);
        System.out.println("                    ");
        System.out.println(thirdStudent.firstName);
        System.out.println(thirdStudent.lastName);
        System.out.println(thirdStudent.studentNo);

    }
}
