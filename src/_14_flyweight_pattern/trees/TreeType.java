package _14_flyweight_pattern.trees;

public class TreeType {
    private final String name;
    private final String color;
    private final String otherTreeData;

    TreeType(String name, String color, String otherTreeData){
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    void draw(int x, int y){
        System.out.println("Tree name: " + name + ", Tree color: " + color + ", other data: "+ otherTreeData);
        System.out.println("Tree is at position: (" + x + "," + y +")");
    }
}
