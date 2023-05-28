package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testTaskListDaoSave() {
        //given
        TaskList taskList = new TaskList("In progress", "Tasks not finished yet");

        //when
        taskListDao.save(taskList);

        //then
        int id = taskList.getId();
        Optional<TaskList> myList = taskListDao.findById(id);
        assertTrue(myList.isPresent());

        //cleanUp
        taskListDao.deleteById(id);
    }

    @Test
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList("In progress", "Tasks not finished yet");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //when
        List<TaskList> myList = taskListDao.findByListName(name);

        //then
        Assertions.assertEquals(1, myList.size());

        //cleanUp
        taskListDao.delete(taskList);

    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }

}
