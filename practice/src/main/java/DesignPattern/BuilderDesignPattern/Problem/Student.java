package DesignPattern.BuilderDesignPattern.Problem;

import java.util.List;

public class Student {
    private int rollNumber;   //mandatory
    private int age;            //optional
    private String studentName;  //optional
    private String fatherName;      //optional
    private String motherName;      //optional
    List<String> subjects;      //optional

    /*problem 1->big constructor*/
    public Student(int rollNumber, int age, String name, String fatherName, String motherName, List<String> subjects) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.studentName = name;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.subjects = subjects;
    }

    /*problem2->many constructors based on use case*/
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(int rollNumber, int age) {
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public Student(int rollNumber, String motherName) {
        this.rollNumber = rollNumber;
        this.motherName = motherName;
    }

    /*problem3->compilation error as some times signature becomes same*/
//    public Student(int rollNumber, String fatherName) {
//        this.rollNumber = rollNumber;
//        this.fatherName = fatherName;
//    }
}
