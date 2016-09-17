package com.java.collection;

import java.util.Iterator;

/**
 * Created by duanxiangchao on 2015/7/29.
 */
public class MyLinkedList<AnyType> implements Iterable<AnyType> {

    private int theSize;
    private int modCount = 0;
    private Node<AnyType> beginMarker;
    private Node<AnyType> endMarker;

    public MyLinkedList(){
        clear();
    }

    private int size(){
        return theSize;
    }

    private boolean isEmpty(){
        return size() == 0;
    }

    public AnyType get(int idx){
        return getNode(idx).data;
    }

    public AnyType set(int idx, AnyType newVal){
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }

    public boolean add(AnyType x){
        add(size(), x);
        return true;
    }

    public void add(int idx, AnyType x){

    }

    private void addBefore(Node<AnyType> p, AnyType x){
        Node<AnyType> newNode = new Node<AnyType>( x, p.prev, p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        theSize++;
        modCount++;
    }

    private AnyType remove(Node<AnyType> p){
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize--;
        modCount++;
        return p.data;
    }

    private Node<AnyType> getNode(int idx){
        Node<AnyType> p;
        if (idx < 0 || idx > size())
            throw new IndexOutOfBoundsException();

        if (idx < size()/2){
            p = beginMarker.next;
            for( int i = 0; i < idx; i++)
                p = p.next;
        }else{
            p = endMarker;
            for( int i = size(); i > idx; i--)
                p = p.prev;
        }
            return p;
    }

    public void clear(){
        beginMarker = new Node<AnyType>(null, null, null);
        endMarker = new Node<AnyType>(null, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;
        modCount++;
    }


    public Iterator<AnyType> iterator() {
        return null;
    }



    private static class Node<AnyType>{

        private AnyType data;
        private Node<AnyType> prev;
        private Node<AnyType> next;

        public Node(AnyType d, Node<AnyType> p, Node<AnyType> n){
            data = d;
            prev = p;
            next = n;
        }

    }

}
