package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";

    public Task makeTask(final String taskKind) {

        return switch (taskKind) {
            case DRIVING_TASK -> new DrivingTask(DRIVING_TASK, "location", "car");
            case PAINTING_TASK -> new PaintingTask(PAINTING_TASK, "color", "object");
            case SHOPPING_TASK -> new ShoppingTask(SHOPPING_TASK, "item", 0);
            default -> null;
        };

    }

}
