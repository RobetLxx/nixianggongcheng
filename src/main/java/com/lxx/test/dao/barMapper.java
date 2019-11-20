package com.lxx.test.dao;

import com.lxx.test.model.bar;
import com.lxx.test.model.barExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface barMapper {
    int countByExample(barExample example);

    int deleteByExample(barExample example);

    int insert(bar record);

    int insertSelective(bar record);

    List<bar> selectByExample(barExample example);

    int updateByExampleSelective(@Param("record") bar record, @Param("example") barExample example);

    int updateByExample(@Param("record") bar record, @Param("example") barExample example);
}