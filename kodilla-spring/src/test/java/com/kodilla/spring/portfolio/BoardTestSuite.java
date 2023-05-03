package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Task 4 is to do");
        board.getToDoList().addTask("Task 5 is to do");
        board.getDoneList().addTask("Task 1 was done");
        board.getInProgressList().addTask("Task 2 is in progress");
        board.getInProgressList().addTask("Task 3 is in progress");

        //Then
        System.out.println("Tasks added are:");
        board.getToDoList().getTasks().forEach(System.out::println);
        board.getInProgressList().getTasks().forEach(System.out::println);
        board.getDoneList().getTasks().forEach(System.out::println);
    }

}
