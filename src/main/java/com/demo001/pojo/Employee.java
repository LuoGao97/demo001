package com.demo001.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Employee
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private Integer id;

    private String lastname;

    private String email;

    /**
     * 0:女   1:男
     */
    private Integer gender;

    private Integer departmentid;

    private Date birth;

    private static final long serialVersionUID = 1L;
}