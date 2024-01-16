package DesignPattern.BuilderDesignPattern;

import java.util.List;

public class Student {
    private int rollNumber;   //mandatory
    private int age;            //optional
    private String studentName;  //optional
    private String fatherName;      //optional
    private String motherName;      //optional
    List<String> subjects;      //optional

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.getRollNumber();
        this.age = builder.getAge();
        this.studentName = builder.getStudentName();
        this.fatherName = builder.getFatherName();
        this.motherName = builder.getMotherName();
        this.subjects = builder.getSubjects();
    }
}
