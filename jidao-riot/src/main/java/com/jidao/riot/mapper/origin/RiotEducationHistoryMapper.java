package com.jidao.riot.mapper.origin;

import com.jidao.common.persistence.entity.riot.origin.RiotEducationHistory;

public interface RiotEducationHistoryMapper {
    int deleteByPrimaryKey(Long id);
    int insertSelective(RiotEducationHistory record);
    RiotEducationHistory selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(RiotEducationHistory record);
}

