package com.breaker93.mybatisplusgenerator.sys.service.impl;

import com.breaker93.mybatisplusgenerator.sys.entity.User;
import com.breaker93.mybatisplusgenerator.sys.mapper.UserMapper;
import com.breaker93.mybatisplusgenerator.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Breaker-93
 * @since 2019-07-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
