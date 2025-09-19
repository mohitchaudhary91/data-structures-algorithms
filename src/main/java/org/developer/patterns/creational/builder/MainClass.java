package org.developer.patterns.creational.builder;

public class MainClass {

    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setName("Mohit").setFatherName("Yashpal").setRollNo(1);
        Student student = studentBuilder.build();
        System.out.println(student);
    }
}
