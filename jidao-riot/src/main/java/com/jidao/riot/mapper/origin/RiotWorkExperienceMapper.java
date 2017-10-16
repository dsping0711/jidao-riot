package com.jidao.riot.mapper.origin;

import com.jidao.common.persistence.entity.riot.origin.RiotWorkExperience;

public interface RiotWorkExperienceMapper {
    int deleteByPrimaryKey(Long id);
    int insertSelective(RiotWorkExperience record);
    RiotWorkExperience selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(RiotWorkExperience record);
    int updateByPrimaryKeyWithBLOBs(RiotWorkExperience record);
}

