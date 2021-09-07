package com.demo001.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * Department
 * @author 
 */
@Data
public class Department implements Serializable {
    private Integer id;

    private String departmentname;

    private static final long serialVersionUID = 1L;
}