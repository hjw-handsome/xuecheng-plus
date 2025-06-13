package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
/**
 * 分页参数
 */
public class PageParams {

    //页码
    private Long pageNo = 1L;

    //每页记录数默认值
    private Long pageSize = 10L;
}
