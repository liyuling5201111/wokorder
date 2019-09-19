package com.example.demo.engine.Entity;

public interface Task {
    public boolean isSuccess();

    public void setSuccess(boolean success);

    public int getTaskId();

    public void setTaskId(int taskId);

    public String getMessage();

    public void setMessage(String message);
}
