package com.yupi.project.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.yupi.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询请求
 *
 * @author yupi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

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
     * 请求类型   get   post 等
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;
}