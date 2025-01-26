package _12_composite_pattern.design_file_system;

class File implements FileSystem {

    private final String fileName;

    File(String name) {
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.print("File name: "+fileName+"     ");
    }
}
