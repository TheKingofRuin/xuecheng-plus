package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author ZYX
 * @version 1.0
 * @description 课程查询条件模型类
 * @date 2024/12/11  15:37
 */
@Data
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;

}