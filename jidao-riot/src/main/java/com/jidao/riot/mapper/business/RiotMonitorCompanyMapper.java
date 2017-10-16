package com.jidao.riot.mapper.business;

import com.jidao.common.persistence.entity.riot.business.RiotMonitorCompany;

public interface RiotMonitorCompanyMapper {
    int deleteByPrimaryKey(Long id);
    int insertSelective(RiotMonitorCompany record);
    RiotMonitorCompany selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(RiotMonitorCompany record);
}

