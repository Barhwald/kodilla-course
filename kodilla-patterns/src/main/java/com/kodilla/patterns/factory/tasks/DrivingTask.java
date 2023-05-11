package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private String where;
    private final String using;
    private boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        setExecuted(true);
        System.out.printf("""
                Executing task...
                %s
                Going to: %s
                Using: %s
                """, taskName, where, using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

    public void setExecuted(boolean executed) {
        isExecuted = executed;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;


    }
}
