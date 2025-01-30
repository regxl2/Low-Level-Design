package _17_iterator_pattern.collection;

import _17_iterator_pattern.iterator.IntegerListIterator;

public class IntegerList implements Collection{

    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            tail.nextNode = newNode;
        }
        tail = newNode;
        ++size;
    }

    public int getSize(){
        return size;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    @Override
    public IntegerListIterator createIterator() {
        return new IntegerListIterator(this);
    }
}
