package _8_builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class CSStudentBuilder extends StudentBuilder{
    @Override
    StudentBuilder addSubjects(){
        List<String> subjects = new ArrayList<>();
        subjects.add("Data Structures and Algorithms");
        subjects.add("Database and Management");
        subjects.add("Operating System");
        this.subjects = subjects;
        return this;
    }
}
