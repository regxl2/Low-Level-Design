package _14_flyweight_pattern.trees;

public class Tree {
    int x;
    int y;
    TreeType type;

    public Tree(int x, int y, TreeType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(){
        type.draw(x, y);
    }
}
