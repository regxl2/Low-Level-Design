package _8_builder_pattern;

public class Main {
    public static void main(String[] args){
        StudentBuilder csStudentBuilder = new CSStudentBuilder();
        csStudentBuilder.addRollNumber(12345).addSubjects().addAge(23).addName("regxl");
        Student csStudent = csStudentBuilder.build();
        System.out.println(csStudent.printDetails());;

        StudentBuilder mbaStudentBuilder = new MBAStudentBuilder();
        mbaStudentBuilder.addName("Lallu").addSubjects().addRollNumber(12346).addFatherName("Ballu").addMotherName("Mallu")
                .addMobileNumber(1232447455).addAge(24);
        Student mbaStudent = mbaStudentBuilder.build();
        System.out.println(mbaStudent.printDetails());
    }
}
