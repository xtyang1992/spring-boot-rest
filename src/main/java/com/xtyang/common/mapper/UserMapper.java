package com.xtyang.common.mapper;

import com.xtyang.common.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yangxiaoting on 2016/07/27.
 */
public interface UserMapper {
    //等价xml文件，@Select("select id, name, phone, email from person")
    List<User> getAllPeronInfo();

    //等价xml文件，@Select("select id, name, phone, email from person where id = ${id}")
    User getPersonInfo(@Param("id")int id);
}
