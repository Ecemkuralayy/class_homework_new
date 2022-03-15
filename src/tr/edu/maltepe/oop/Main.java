package tr.edu.maltepe.oop;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student("Ecem", "Kuralay", 190704028, 35647891866L);

        firstStudent.learns();
        firstStudent.studies();

        Student secondStudent = new Student("Nur","Karakaya", 200704006,12457892088L );



        Student thirdStudent = new Student("Yusuf", "Akbulut", 190304033,12345678122L );


        Person2 myPerson2 = new Person2();
        myPerson2.firstName = "Beyza";
        myPerson2.lastName = "KAVAZ";
        myPerson2.studentNo = 190304012;
        myPerson2.setTCKN(98765432188L);


        Professor firstProfessor = new Professor();
        firstProfessor.FirstName = "Ensar";
        firstProfessor.LastName = "GÜL";
        firstProfessor.teaches();
        firstProfessor.help();

        Professor secondProfessor = new Professor();
        secondProfessor.FirstName = "Raif";
        secondProfessor.LastName = "ÖNVURAL";

        Person myPerson = new Person();
        myPerson.FirstName = "Kayhan";
        myPerson.LastName = "ERCİYEŞ";

        System.out.println("PROFESSORS:");
        System.out.println("             ");
        System.out.println(firstProfessor.FirstName);
        System.out.println(firstProfessor.LastName);
        System.out.println("                     ");
        System.out.println(secondProfessor.FirstName);
        System.out.println(secondProfessor.LastName);
        System.out.println("                     ");
        System.out.println(myPerson.FirstName);
        System.out.println(myPerson.LastName);
        System.out.println("                    ");
        System.out.println("STUDENTS:");
        System.out.println("                      ");
        System.out.println(firstStudent.firstName);
        System.out.println(firstStudent.lastName);
        System.out.println(firstStudent.studentNo);
        System.out.println(firstStudent.getTCKN());
        System.out.println("                     ");
        System.out.println(secondStudent.firstName);
        System.out.println(secondStudent.lastName);
        System.out.println(secondStudent.studentNo);
        System.out.println(secondStudent.getTCKN());
        System.out.println("                    ");
        System.out.println(thirdStudent.firstName);
        System.out.println(thirdStudent.lastName);
        System.out.println(thirdStudent.studentNo);
        System.out.println(thirdStudent.getTCKN());
        System.out.println("                ");
        System.out.println(myPerson2.firstName);
        System.out.println(myPerson2.lastName);
        System.out.println(myPerson2.studentNo);
        System.out.println(myPerson2.getTCKN());

    }
}
