package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@ApiModel("课程查询dto")
public class QueryCourseParamsDto {
    //审核状态
    @ApiModelProperty("审核状态")
    private String auditStatus;

    //审核状态
    @ApiModelProperty("审核状态")
    private String courseName;

    //审核状态
    @ApiModelProperty("审核状态")
    private String publishStatus;
}
