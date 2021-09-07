package com.demo001.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Department
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private Integer id;

    private String departmentname;

    private static final long serialVersionUID = 1L;
}