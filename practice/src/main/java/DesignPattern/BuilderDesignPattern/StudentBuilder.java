package DesignPattern.BuilderDesignPattern;


import java.util.List;

public abstract class StudentBuilder {
    private int rollNumber;   //mandatory
    private int age;            //optional
    private String studentName;  //optional
    private String fatherName;      //optional
    private String motherName;      //optional
    List<String> subjects;      //optional

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setSubjects() {
        this.subjects = subjects;
        return this;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public Student build() {
        return new Student(this);
    }
}
