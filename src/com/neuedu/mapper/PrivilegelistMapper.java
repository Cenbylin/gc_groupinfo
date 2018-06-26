package com.neuedu.mapper;

import com.neuedu.model.Privilegelist;
import com.neuedu.model.PrivilegelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegelistMapper {
    long countByExample(PrivilegelistExample example);

    int deleteByExample(PrivilegelistExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Privilegelist record);

    int insertSelective(Privilegelist record);

    List<Privilegelist> selectByExample(PrivilegelistExample example);

    Privilegelist selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Privilegelist record, @Param("example") PrivilegelistExample example);

    int updateByExample(@Param("record") Privilegelist record, @Param("example") PrivilegelistExample example);

    int updateByPrimaryKeySelective(Privilegelist record);

    int updateByPrimaryKey(Privilegelist record);
}