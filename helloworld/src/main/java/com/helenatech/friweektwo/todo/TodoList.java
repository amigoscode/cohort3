package com.helenatech.friweektwo.todo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class TodoList {
    private User user;
    private List<Todo> todos;
    private boolean isCompleted;
    private LocalDateTime completedAt;

    public TodoList(User user,
                    List<Todo> todos,
                    boolean isCompleted,
                    LocalDateTime completedAt) {
        this.user = user;
        this.todos = todos;
        this.isCompleted = isCompleted;
        this.completedAt = completedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoList todoList = (TodoList) o;
        return isCompleted == todoList.isCompleted && Objects.equals(user, todoList.user) && Objects.equals(todos, todoList.todos) && Objects.equals(completedAt, todoList.completedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, todos, isCompleted, completedAt);
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "user=" + user +
                ", todos=" + todos +
                ", isCompleted=" + isCompleted +
                ", completedAt=" + completedAt +
                '}';
    }
}
