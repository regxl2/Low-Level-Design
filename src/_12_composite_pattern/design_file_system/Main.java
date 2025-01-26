package _12_composite_pattern.design_file_system;

import java.util.LinkedList;
import java.util.Queue;


//Composite is a structural design pattern that lets you compose objects
//into tree structures and then work with these structures as if they were individual objects.
//
//Composite became a pretty popular solution for the most problems that require building a tree structure.
//Composite’s great feature is the ability to run methods recursively over the whole tree structure
//and sum up the results.

public class Main {
    private static void printFileSystem(FileSystem root){
        Queue<FileSystem> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                FileSystem fileSystem = q.poll();
                if(fileSystem instanceof Directory){
                    fileSystem.ls();
                    q.addAll(((Directory) fileSystem).fileSystemList);
                }
                else if(fileSystem instanceof File){
                    fileSystem.ls();
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        File imlFile = new File("Low Level design.iml");
        Directory lowLevelDesign = new Directory("Low Level Design");
        root.add(imlFile);
        root.add(lowLevelDesign);
        Directory designFileSystem = new Directory("design_file_system");
        File directoryClass = new File("Directory.class");
        File file = new File("File.class");
        File fileSystem = new File("FileSystem.interface");
        File main = new File("Main.class");
        designFileSystem.add(directoryClass);
        designFileSystem.add(file);
        designFileSystem.add(fileSystem);
        designFileSystem.add(main);
        lowLevelDesign.add(designFileSystem);

        printFileSystem(root);
    }
}
