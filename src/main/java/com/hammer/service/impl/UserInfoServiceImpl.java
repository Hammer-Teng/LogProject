package com.hammer.service.impl;

import com.hammer.entity.User;
import com.hammer.dao.UserInfoMapper;
import com.hammer.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hammer_teng
 * @since 2024-08-12
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, User> implements UserInfoService {

}
