package com.neuedu.mapper;

import com.neuedu.model.Translate;
import com.neuedu.model.TranslateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TranslateMapper {
	List<Translate> selectAll();
	List<Translate> findBytpbh( int tid );
	
    long countByExample(TranslateExample example);

    int deleteByExample(TranslateExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Translate record);

    int insertSelective(Translate record);

    List<Translate> selectByExample(TranslateExample example);

    Translate selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Translate record, @Param("example") TranslateExample example);

    int updateByExample(@Param("record") Translate record, @Param("example") TranslateExample example);

    int updateByPrimaryKeySelective(Translate record);

    int updateByPrimaryKey(Translate record);
}