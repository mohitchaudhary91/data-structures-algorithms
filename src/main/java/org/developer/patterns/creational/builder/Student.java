package org.developer.patterns.creational.builder;

public class Student {
    private final int rollNo;
    private final String name;
    private final String fatherName;
    private final String motherName;

    public Student(StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.getRollNo();
        this.name = studentBuilder.getName();
        this.fatherName = studentBuilder.getFatherName();
        this.motherName = studentBuilder.getMotherName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}
