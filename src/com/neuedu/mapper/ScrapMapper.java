package com.neuedu.mapper;

import com.neuedu.model.Scrap;
import com.neuedu.model.ScrapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScrapMapper {
	List<Scrap> selectAll();
	List<Scrap> findBybfdh(Integer sid);
	
    long countByExample(ScrapExample example);

    int deleteByExample(ScrapExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Scrap record);

    int insertSelective(Scrap record);

    List<Scrap> selectByExample(ScrapExample example);

    Scrap selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Scrap record, @Param("example") ScrapExample example);

    int updateByExample(@Param("record") Scrap record, @Param("example") ScrapExample example);

    int updateByPrimaryKeySelective(Scrap record);

    int updateByPrimaryKey(Scrap record);
}