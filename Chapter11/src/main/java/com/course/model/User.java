package com.course.model;

import lombok.Data;

@Data
public class User {
    private String sn;
    private String password;
    private String name;
    private String departmentSn;
    private String post;
}
