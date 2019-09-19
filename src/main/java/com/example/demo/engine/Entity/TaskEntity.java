package com.example.demo.engine.Entity;

import jdk.internal.dynalink.beans.StaticClass;
import lombok.Data;

@Data
public class TaskEntity implements Task {
    public boolean isSuccess;
    public int taskId;
    public String message;


}
