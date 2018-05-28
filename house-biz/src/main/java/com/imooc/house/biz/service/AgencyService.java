package com.imooc.house.biz.service;

import com.imooc.house.biz.mapper.AgencyMapper;
import com.imooc.house.common.model.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService {

    @Autowired
    private AgencyMapper agencyMapper;

    // @Value("${file.prefix}")
    // private String imgPrefix;


    public List<Agency> getAllAgency() {
        return agencyMapper.select(new Agency());
    }


}
