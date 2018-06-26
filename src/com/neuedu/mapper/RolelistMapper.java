package com.neuedu.mapper;

import com.neuedu.model.Rolelist;
import com.neuedu.model.RolelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolelistMapper {
    long countByExample(RolelistExample example);

    int deleteByExample(RolelistExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Rolelist record);

    int insertSelective(Rolelist record);

    List<Rolelist> selectByExample(RolelistExample example);

    Rolelist selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Rolelist record, @Param("example") RolelistExample example);

    int updateByExample(@Param("record") Rolelist record, @Param("example") RolelistExample example);

    int updateByPrimaryKeySelective(Rolelist record);

    int updateByPrimaryKey(Rolelist record);
}