package com.homework.nix.task.data;

public class Node<E> {

    E item;
    Node<E> node;


    public Node(E item) {
        this.item = item;
    }

    public Node<E> getNode(){
        return node;
    }

    public void setNode(Node<E> node) {
        this.node = node;
    }

    public E getItem(){
        return item;
    }

    public void setItem(E item){
        this.item = item;
    }
}
