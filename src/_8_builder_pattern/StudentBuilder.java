package _8_builder_pattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;
    int mobileNumber;

    StudentBuilder addRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }
    StudentBuilder addAge(int age){
        this.age = age;
        return this;
    }
    StudentBuilder addName(String name){
        this.name = name;
        return this;
    }
    StudentBuilder addFatherName(String fatherName){
        this.fatherName = fatherName;
        return this;
    }
    StudentBuilder addMotherName(String motherName){
        this.motherName = motherName;
        return this;
    }
    abstract StudentBuilder addSubjects();

    StudentBuilder addMobileNumber(int mobileNumber){
        this.mobileNumber = mobileNumber;
        return this;
    }

    Student build(){
        return new Student(this);
    }
}
