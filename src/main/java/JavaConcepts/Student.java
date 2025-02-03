package JavaConcepts;

public class Student {
    private String firstName;
    private String lastName;
    private int rollNo;
    private int grade;
    private int age;
    private String address;

    public Student(String firstName, String lastName, int rollNo, int grade, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.grade = grade;
        this.age = age;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getFirstName() {
        return "First Name: " + this.firstName;
    }

    public String getLastName() {
        return "Last Name: " + this.lastName;
    }

    public String getRollNo() {
        return "Roll NUmber: " + this.rollNo;
    }

    public String getGrade() {
        return "Grade: " + this.grade;
    }

    public String getAge() {
        return "Age: " + this.age;
    }

    public String getAddress() {
        return "Address: " + this.address;
    }

    public String getFullName() {
        return "Full Name: " + firstName + lastName;
    }

    public String getGradeInfo() {
        return "Roll number " + rollNo + "of grade " + grade + ".";
    }

    public String getAgeInfo() {
        if (age > 13) {
            return "Age is greater than 13";
        } else {
            return "Age is smaller than 13";
        }
    }
}