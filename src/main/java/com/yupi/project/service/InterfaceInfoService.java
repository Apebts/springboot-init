package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.project.model.entity.InterfaceInfo;
import com.yupi.project.model.entity.Post;

/**
* @author GLK
* @description 针对表【interface_info】的数据库操作Service
* @createDate 2023-04-20 14:21:03
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {



    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
