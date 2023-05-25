package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
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
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList("In progress", "Tasks not finished yet");

        //when
        taskListDao.save(taskList);

        //then
        String name = taskList.getListName();
        Optional<List<TaskList>> optionalTaskList = Optional.ofNullable(taskListDao.findByListName(name));
        assertTrue(optionalTaskList.isPresent());

        //cleanUp
        taskListDao.delete(taskList);

    }

}
