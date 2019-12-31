package cn.com.lxz.mybatis.generator.service.impl;

import cn.com.lxz.mybatis.generator.dao.UserMapper;
import cn.com.lxz.mybatis.generator.model.User;
import cn.com.lxz.mybatis.generator.service.UserService;
import cn.com.lxz.mybatis.generator.core.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author  lvxuezhan
* @version 2019-12-31 15:06:11.
*/
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;
}