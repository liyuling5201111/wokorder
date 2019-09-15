package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class WorkorderTemplateDto implements Serializable {
    private Integer id;

    private String name;

    private String type;

    private String template;

    private String vesion;


}