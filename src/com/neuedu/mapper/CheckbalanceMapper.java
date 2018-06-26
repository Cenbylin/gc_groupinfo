package com.neuedu.mapper;

import com.neuedu.model.Checkbalance;
import com.neuedu.model.CheckbalanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckbalanceMapper {
    long countByExample(CheckbalanceExample example);

    int deleteByExample(CheckbalanceExample example);

    int deleteByPrimaryKey(Integer chid);

    int insert(Checkbalance record);

    int insertSelective(Checkbalance record);

    List<Checkbalance> selectByExample(CheckbalanceExample example);

    Checkbalance selectByPrimaryKey(Integer chid);

    int updateByExampleSelective(@Param("record") Checkbalance record, @Param("example") CheckbalanceExample example);

    int updateByExample(@Param("record") Checkbalance record, @Param("example") CheckbalanceExample example);

    int updateByPrimaryKeySelective(Checkbalance record);

    int updateByPrimaryKey(Checkbalance record);
}