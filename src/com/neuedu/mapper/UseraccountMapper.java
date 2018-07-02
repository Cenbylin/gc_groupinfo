package com.neuedu.mapper;

import com.neuedu.model.Useraccount;
import com.neuedu.model.UseraccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseraccountMapper {
    long countByExample(UseraccountExample example);

    int deleteByExample(UseraccountExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Useraccount record);

    int insertSelective(Useraccount record);

    List<Useraccount> selectByExample(UseraccountExample example);

    Useraccount selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Useraccount record, @Param("example") UseraccountExample example);

    int updateByExample(@Param("record") Useraccount record, @Param("example") UseraccountExample example);

    int updateByPrimaryKeySelective(Useraccount record);

    int updateByPrimaryKey(Useraccount record);
}