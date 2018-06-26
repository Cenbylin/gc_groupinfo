package com.neuedu.mapper;

import com.neuedu.model.Roleprivilege;
import com.neuedu.model.RoleprivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleprivilegeMapper {
    long countByExample(RoleprivilegeExample example);

    int deleteByExample(RoleprivilegeExample example);

    int deleteByPrimaryKey(Integer rpid);

    int insert(Roleprivilege record);

    int insertSelective(Roleprivilege record);

    List<Roleprivilege> selectByExample(RoleprivilegeExample example);

    Roleprivilege selectByPrimaryKey(Integer rpid);

    int updateByExampleSelective(@Param("record") Roleprivilege record, @Param("example") RoleprivilegeExample example);

    int updateByExample(@Param("record") Roleprivilege record, @Param("example") RoleprivilegeExample example);

    int updateByPrimaryKeySelective(Roleprivilege record);

    int updateByPrimaryKey(Roleprivilege record);
}