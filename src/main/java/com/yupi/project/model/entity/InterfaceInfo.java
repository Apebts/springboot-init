package com.yupi.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName interface_info
 */
@TableName(value ="interface_info")
@Data
public class InterfaceInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 
     */
    private String requestHeader;

    /**
     * 
     */
    private String responseHeader;

    /**
     * 0  关闭
1  开启
     */
    private Integer status;

    /**
     * 
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 请求类型   get   post 等
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}