package _17_iterator_pattern.iterator;

import _17_iterator_pattern.collection.IntegerList;
import _17_iterator_pattern.collection.Node;

public class IntegerListIterator implements Iterator{

    private final IntegerList integerList;
    private int index;
    private Node currentNode;

    public IntegerListIterator(IntegerList integerList){
        this.integerList = integerList;
        this.index = 0;
        this.currentNode = integerList.getHead();
    }

    @Override
    public boolean hasNext() {
        return index < integerList.getSize();
    }

    @Override
    public int next() {
        ++index;
        int value = currentNode.value;
        currentNode = currentNode.nextNode;
        return value;
    }
}
