package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i);
            if (a % 2 == 0 ) {
                evenList.add(a);
            }
        }

        return evenList;

    }

}
