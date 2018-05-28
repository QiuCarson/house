package com.imooc.house.biz.mapper;

import com.imooc.house.common.model.Agency;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AgencyMapper {

    List<Agency> select(Agency agency);


}
