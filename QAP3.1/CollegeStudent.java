/**
QAP 3.1
Joseph Flores
June 12, 2024
*/

public class CollegeStudent extends Student {
    private String major; // e.g. “Electrical Engineering”, “Communications”, “Undeclared”
    private int year;     // e.g. FROSH = 1, SOPH = 2, …

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // use the super class’ constructor
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + "\nYear: " + year + "\nMajor: " + major;
    }
}
