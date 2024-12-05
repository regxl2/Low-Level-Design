package _8_builder_pattern.why_need_builder_pattern;

import java.util.List;
// Why do we need a builder pattern?
// Let suppose we have Student class in that class we have only rollNumber field is mandatory
// and every other field is optional.

class Student {
    int rollNumber; // Mandatory
    int age; // Optional
    String name; // Optional
    String fatherName; // Optional
    String motherName; // Optional
    List<String> subjects; // Optional
    String mobileNumber; // Optional

    // problem1 - Constructor will have a lot of parameters
    Student(int rollNumber, int age, String name, String fatherName, String motherName, List<String> subjects, String mobileNumber){
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subjects = subjects;
        this.mobileNumber = mobileNumber;
    }

    // If we try to solve the problem1 by making constructor for each case.
    // then problem2 to arise, we have to make a lot of constructors for each case

    Student(int rollNumber){
        this.rollNumber = rollNumber;
    }

    Student(int rollNumber, int age){
        this.rollNumber = rollNumber;
        this.age = age;
    }

    Student(int rollNumber, String name ){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // many constructors can be made with the combination of the fields
}
