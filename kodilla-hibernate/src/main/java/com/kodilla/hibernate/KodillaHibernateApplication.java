package com.kodilla.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;
import java.util.TreeSet;

@SpringBootApplication
public class KodillaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaHibernateApplication.class, args);
        int[] testArr = {3,1,1,5,6,7,9,15,3,4,7,10};
        int[] myArr = {1,2,3,4,5,6,7,8,9,11,67,99,2137,4444,-3};
        System.out.println(testArr.length);
        System.out.println(findSecondMin(testArr));
        System.out.println(findSecondMax(testArr));
        System.out.println(findSecondMin(myArr));
        System.out.println(findSecondMax(myArr));
    }

    //Extra Assignment

    public static int findSecondMin(int[] nums) {
        TreeSet<Integer> numSet = new TreeSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        numSet.pollFirst();
        return numSet.pollFirst();
    }

    public static int findSecondMax(int[] nums) {
        TreeSet<Integer> numSet = new TreeSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        numSet.pollLast();
        return numSet.pollLast();
    }

}
