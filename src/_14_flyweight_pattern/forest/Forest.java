package _14_flyweight_pattern.forest;

import _14_flyweight_pattern.trees.Tree;
import _14_flyweight_pattern.trees.TreeFactory;
import _14_flyweight_pattern.trees.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String otherTreeData){
        TreeType treeType = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void drawForest(){
        for(Tree tree: trees){
            tree.draw();
        }
    }
}
