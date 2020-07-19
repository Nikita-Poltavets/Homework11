package com.homework.nix.task.service.impl;

import com.homework.nix.task.data.Node;
import com.homework.nix.task.service.ForwardLinkedListService;

import java.util.AbstractList;

public class ForwardLinkedListServiceImpl<E extends Number> extends AbstractList<E> implements ForwardLinkedListService<E>{

    private int size;

    private Node<E> node;

    public ForwardLinkedListServiceImpl(){

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {

        if (index < 0)
            return null;
        Node<E> nodeCurrent = null;
        if (node != null) {
            nodeCurrent = node.getNode();
            for (int i = 0; i < index; i++) {
                if (nodeCurrent.getNode() == null)
                    return null;

                nodeCurrent = nodeCurrent.getNode();
            }
            return nodeCurrent.getItem();
        }
        return nodeCurrent.getItem();
    }

    @Override
    public void addElement(E item) {
        if (node == null) {
            node = new Node<>(item);
        }

        Node nodeTemp = new Node<>(item);
        Node nodeCurrent = node;

        if (nodeCurrent != null) {

            while (nodeCurrent.getNode() != null) {
                nodeCurrent = nodeCurrent.getNode();
            }

            nodeCurrent.setNode(nodeTemp);
        }

        size++;
    }

    @Override
    public void insert(E item, int index) throws IndexOutOfBoundsException {
        if(item == null){
            return;
        }
        if(index == size){
            addElement(item);
        }else if(index < size){
            Node<E> newNode = new Node<>(item);
            Node<E> prevNode = getNode(index - 1);
            Node<E> nextNode = getNode(index);

            newNode.setNode(nextNode);
            prevNode.setNode(newNode);
            size++;
        }
        else {
            throw new IndexOutOfBoundsException("Out of bound");
        }
    }

    @Override
    public void removeElement(int index){
        if(index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Out of bound");
        }

        Node<E> currNode = node;

        if(node != null){
            for (int i = 0; i < index; i++) {
                if(currNode.getNode() == null)
                    return;
            }
        }
        currNode.setNode(currNode.getNode().getNode());

        size--;
    }

    @Override
    public E firstElement(){
        if(node == null){
            return null;
        }
        return node.getItem();
    }

    @Override
    public void addFirst(E item) {
        if(item == null) {
            return;
        }

        Node<E> newNode = new Node<>(item);
        if(this.node != null){
            newNode.setNode(this.node);
            this.node = newNode;
        }else {
            this.node = newNode;
        }
        size++;
    }

    private Node<E> getNode(int index){
        if(index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Out of bound");
        }
        if(index == 0){
            return node;
        }

        if(index == size - 1){
            return getLastNode(node);
        }

        int pointer = 0;

        Node<E> pointerNode = node;

        while (pointer <= index){
            if(pointer == index){
                return pointerNode;
            } else {
                pointerNode = next(pointerNode);
                pointer++;
            }
        }
        return null;
    }


    private Node<E> getLastNode(Node<E> node) {
        Node<E> lastNode = node;
        if(lastNode.getNode() != null){
            return getLastNode(lastNode.getNode());
        }else {
            return lastNode;
        }
    }

    private Node<E> next(Node<E> pointerNode) {
        if(node.getNode() != null){
            return node.getNode();
        }else {
            return null;
        }
    }

}

