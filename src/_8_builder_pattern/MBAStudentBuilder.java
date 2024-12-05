package _8_builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    StudentBuilder addSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Micro Economics");
        subjects.add("Business Studies");
        subjects.add("Operation Management");
        this.subjects = subjects;
        return this;
    }
}
