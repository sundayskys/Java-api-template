package com.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {

    User getUserByName(String name);

}
