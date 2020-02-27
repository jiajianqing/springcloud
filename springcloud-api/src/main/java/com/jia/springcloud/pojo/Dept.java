package com.jia.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable { //Dept 实体类 orm类表关系映射

    private Long deptno;
    private String dname;
    private String db_source;
}
