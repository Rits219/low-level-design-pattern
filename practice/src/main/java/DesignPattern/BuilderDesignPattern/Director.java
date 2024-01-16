package DesignPattern.BuilderDesignPattern;

public class Director {
    StudentBuilder builder;

    public Director(StudentBuilder builder) {
        this.builder = builder;
    }

    public Student createStudent() {
        if (builder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (builder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return builder.setRollNumber(1).setAge(20).setStudentName("Ritesh").setSubjects().build();
    }

    private Student createMBAStudent() {
        return builder.setRollNumber(2).setAge(30).setStudentName("Sawan").setSubjects().build();
    }
}
