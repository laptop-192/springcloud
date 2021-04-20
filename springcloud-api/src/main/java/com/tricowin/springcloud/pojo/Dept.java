package com.tricowin.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 实体类
 */
//Serializable通信需要进行序列化
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式编程
public class Dept implements Serializable {

    private Long deptno;//主键
    private String dname;

    //这个数据存在哪个数据库字段，应用微服务，存在多个数据库时设置,同一信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }


}
