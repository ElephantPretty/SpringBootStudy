package com.elephant111.Controller;

import com.elephant111.domain.User;
import com.elephant111.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MybatisController {
//    @Resource
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryUserList() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
