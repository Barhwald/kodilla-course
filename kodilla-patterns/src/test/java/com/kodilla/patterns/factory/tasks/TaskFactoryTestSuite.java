package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TaskFactoryTestSuite {

    private final TaskFactory taskFactory = new TaskFactory();

    @Test
    void testCreateShoppingTask() {

        //Given & When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        //Then
        assertEquals(true, shoppingTask.isTaskExecuted());
        assertEquals("SHOPPING TASK", shoppingTask.getTaskName());

    }

    @Test
    void testCreatePaintingTask() {

        //Given & When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        //Then
        assertEquals(true, paintingTask.isTaskExecuted());
        assertEquals("PAINTING TASK", paintingTask.getTaskName());

    }

    @Test
    void testCreateDrivingTask() {

        //Given & When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        //Then
        assertEquals(true, drivingTask.isTaskExecuted());
        assertEquals("DRIVING TASK", drivingTask.getTaskName());

    }

}
