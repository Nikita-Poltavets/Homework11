package com.homework.nix.task.service.impl;

import com.homework.nix.task.service.FilterNumbersService;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbersServiceImpl implements FilterNumbersService {

    @Override
    public int filterNumbersInCollection(List<String> stringList) {

        List<String> allNumbersStringList = stringList.stream().map(s -> s.replaceAll("\\D+","")).collect(Collectors.toList());

        String stringOfNumbers = String.join("", allNumbersStringList);

        int allNumbers = Integer.parseInt(stringOfNumbers);

        return allNumbers;
    }
}
