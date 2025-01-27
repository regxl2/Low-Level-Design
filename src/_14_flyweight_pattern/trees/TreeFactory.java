package _14_flyweight_pattern.trees;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> cache = new HashMap<>();
    public static TreeType getTreeType(String name, String color, String otherTreeData){
        if(cache.containsKey(name)) return cache.get(name);
        TreeType treeType = new TreeType(name, color, otherTreeData);
        cache.put(name, treeType);
        return treeType;
    }
}
