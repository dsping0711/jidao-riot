package com.jidao.riot.mapper.business;

import com.jidao.common.persistence.entity.riot.business.RiotTalentResume;

public interface RiotTalentResumeMapper {
    int deleteByPrimaryKey(Long id);
    int insertSelective(RiotTalentResume record);
    RiotTalentResume selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(RiotTalentResume record);
}

