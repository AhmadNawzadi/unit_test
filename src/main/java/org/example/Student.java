package org.example;

public class Student {
    private final String name;
    private final String university;
    private final int age;

    public Student(StudentBuilder sb) {
        this.name = sb.name;
        this.university = sb.university;
        this.age = sb.age;
    }



 public static class StudentBuilder {
    private final String name;
    private final String university;
    private int age;
    public StudentBuilder(String name, String university) {
        this.name = name;
        this.university = university;
    }
    public StudentBuilder setAge(int name){
        this.age = name;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}}
