package com.lxx.test.dao;

import com.lxx.test.model.t_user;
import com.lxx.test.model.t_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_userMapper {
    int countByExample(t_userExample example);

    int deleteByExample(t_userExample example);

    int deleteByPrimaryKey(String id);

    int insert(t_user record);

    int insertSelective(t_user record);

    List<t_user> selectByExample(t_userExample example);

    t_user selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") t_user record, @Param("example") t_userExample example);

    int updateByExample(@Param("record") t_user record, @Param("example") t_userExample example);

    int updateByPrimaryKeySelective(t_user record);

    int updateByPrimaryKey(t_user record);
}