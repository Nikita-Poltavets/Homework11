package com.homework.nix.task.service.impl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterNumbersTest {

    @Test
    void filterNumbersInCollection() {

        int example = 12345;

        List<String> stringList = Arrays.asList("string 1 text", "2 string 3 text", "45");

        FilterNumbersServiceImpl filterNumbersService = new FilterNumbersServiceImpl();

        assertEquals(filterNumbersService.filterNumbersInCollection(stringList), example);
    }
}