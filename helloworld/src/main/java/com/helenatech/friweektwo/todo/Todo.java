package com.helenatech.friweektwo.todo;

import java.util.Objects;

public class Todo {
    private String description;
    private boolean isCompleted;

    public Todo(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return isCompleted == todo.isCompleted && Objects.equals(description, todo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, isCompleted);
    }
}
