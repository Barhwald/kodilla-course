package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

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

}
