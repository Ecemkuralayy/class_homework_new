package tr.edu.maltepe.oop;

public class Student {
    String firstName;
    String lastName;
    int studentNo;
    private long TCKN;

    public Student(String firstName,String lastName, int studentNo, long TCKN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNo = studentNo;
        this.TCKN = TCKN;
    }

    public void learns(){
        System.out.println("Student learns");
    }
    public void studies(){
        System.out.println("Student studies");
    }
    public void setStudentNo(int studentNo){
        this.studentNo = studentNo;
    }
    public void setTCKN(long TCKN){
        this.TCKN = TCKN;
    }
    public long getTCKN(){
        return TCKN;
    }
}
