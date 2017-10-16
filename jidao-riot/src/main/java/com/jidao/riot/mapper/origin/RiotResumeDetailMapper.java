package com.jidao.riot.mapper.origin;

import com.jidao.common.persistence.entity.riot.origin.RiotResumeDetail;

public interface RiotResumeDetailMapper {
    int deleteByPrimaryKey(Long id);
    int insertSelective(RiotResumeDetail record);
    RiotResumeDetail selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(RiotResumeDetail record);
}

