package com.example.demo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TemplateAttributeDto implements Serializable {
    private Integer id;

    private String url;

    private Byte timeout;

    private Integer templateId;

    private Integer nodeCode;

    private String nodeName;
}