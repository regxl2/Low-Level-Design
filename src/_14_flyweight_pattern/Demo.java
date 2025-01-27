package _14_flyweight_pattern;

import _14_flyweight_pattern.forest.Forest;

public class Demo {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1,2, "mango", "green", "very delicious mangoes");
        forest.plantTree(2,1, "neem", "green", "good medicinal tree");
        forest.drawForest();
    }
}
