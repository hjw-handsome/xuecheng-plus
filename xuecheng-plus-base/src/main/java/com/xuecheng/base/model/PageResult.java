package com.xuecheng.base.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回结果
 */
@Data
@ToString
@AllArgsConstructor
public class PageResult<T> implements Serializable {
    //1.结果数据
    private List<T> items;

    //2.总记录数
    private Long count;

    //3.页码
    private Long pageNo;

    //4.每页记录数
    private Long pageSize;
}
