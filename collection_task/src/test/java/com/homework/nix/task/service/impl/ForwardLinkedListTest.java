package com.homework.nix.task.service.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForwardLinkedListTest {

    ForwardLinkedListServiceImpl forwardLinkedListService = new ForwardLinkedListServiceImpl();

    @Test
    void size() {
        forwardLinkedListService.addElement(1);
        forwardLinkedListService.addElement(2);
        forwardLinkedListService.addElement(3);
       assertEquals(forwardLinkedListService.size() , 3);
    }

    @Test
    void get() {
        forwardLinkedListService.addElement(1);
        assertEquals(forwardLinkedListService.get(0), 1);
    }

}