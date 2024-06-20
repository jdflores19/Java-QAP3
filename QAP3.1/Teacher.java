/**
QAP 3.1
Joseph Flores
June 12, 2024
*/

public class Teacher extends Person {
    private String subject; // e.g. “Computer Science”, “Chemistry”, “English”, “Other”
    private double salary;  // the teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // use the super class’ constructor
        this.subject = subject;
        this.salary = salary;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsubject: " + subject + "\nsalary: $" + String.format("%,.2f", salary);
    }
}
