/**
QAP 3.1
Joseph Flores
June 12, 2024
*/

public class Student extends Person {
    protected String myIdNum;   // Student Id Number
    protected double myGPA;     // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // use the super class’ constructor
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nID: " + myIdNum + "\nGPA: " + myGPA;
    }
}
