package _8_builder_pattern;

import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;
    int mobileNumber;

    Student(StudentBuilder builder){
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
        this.mobileNumber = builder.mobileNumber;
    }

    public String printDetails() {
        return
                "RollNumber: " + rollNumber + "\nAge: " + age + "\nName: " + name + "\nFather's name: " + fatherName
                        + "\nMother's name: " + motherName + "\nSubjects: " + subjects.get(0) + ", " + subjects.get(1) + ", " +
                        subjects.get(2) + "\n" + "Mobile number: " + mobileNumber+"\n";
    }
}
