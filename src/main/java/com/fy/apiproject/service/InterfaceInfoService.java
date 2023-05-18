package com.fy.apiproject.service;
import java.util.Date;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fy.apiproject.common.ErrorCode;
import com.fy.apiproject.exception.BusinessException;
import com.fy.apiproject.exception.ThrowUtils;
import com.fy.apiproject.model.dto.interfaceinfo.InterfaceInfoQueryRequest;
import com.fy.apiproject.model.entity.InterfaceInfo;
import com.fy.apiproject.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
* @author 86134
* @description 针对表【interface_info】的数据库操作Service
* @createDate 2023-05-17 17:21:11
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {


    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 得到QueryWrapper对象
     * @param interfaceInfoQueryRequest
     * @return
     */
    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);

    Page<InterfaceInfo> getInterfaceInfoVOPage(Page<InterfaceInfo> interfaceInfoPage, HttpServletRequest request);
}
