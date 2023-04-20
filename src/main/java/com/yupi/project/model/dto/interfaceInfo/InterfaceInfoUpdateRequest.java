package com.yupi.project.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoUpdateRequest implements Serializable {


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


}