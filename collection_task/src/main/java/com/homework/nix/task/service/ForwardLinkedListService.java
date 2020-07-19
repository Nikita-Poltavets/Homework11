package com.homework.nix.task.service;

import java.util.AbstractList;
import java.util.List;

public interface ForwardLinkedListService<E extends Number> {

    void addElement(E item);

    void insert(E item, int index) throws IndexOutOfBoundsException;

    E firstElement();

    void addFirst(E item);

    void removeElement(int index);
}
