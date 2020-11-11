package com.elephant111.mapper;

import com.elephant111.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Mapper
@Repository
public interface UserMapper {
    public List<User> queryUserList();
}
