package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.game.Form;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface FormMapper extends BaseMapper<Form> {
    @Update("UPDATE form SET is_delete = #{delete} WHERE id = #{id}")
    int updateDeleteById(@Param("id") int id, @Param("delete") int delete);
}
