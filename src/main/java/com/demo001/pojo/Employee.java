package com.demo001.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * Employee
 * @author 
 */
@Data
public class Employee implements Serializable {
    private Integer id;

    private String lastname;

    private String email;

    /**
     * 0:女   1:男
     */
    private Integer gender;

    private String department;

    private static final long serialVersionUID = 1L;
}