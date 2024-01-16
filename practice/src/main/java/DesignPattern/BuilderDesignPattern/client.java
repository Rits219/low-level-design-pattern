package DesignPattern.BuilderDesignPattern;

public class client {
    public static void main(String[] args) {
        Director engineerDirector = new Director(new EngineeringStudentBuilder());
        Director mbaDirector = new Director(new MBAStudentBuilder());

        Student engineeringStudent = engineerDirector.createStudent();
        System.out.println(engineeringStudent.toString());

    }
}
