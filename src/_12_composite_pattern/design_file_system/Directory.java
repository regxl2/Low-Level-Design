package _12_composite_pattern.design_file_system;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystem{

    private final String directoryName;

    final List<FileSystem> fileSystemList;

    Directory(String directoryName){
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    void add(FileSystem fileSystem){
        this.fileSystemList.add(fileSystem);
    }

    void remove(FileSystem fileSystem){
        this.fileSystemList.remove(fileSystem);
    }

    @Override
    public void ls() {
        System.out.print("Directory name: "+directoryName+"     ");
    }
}
