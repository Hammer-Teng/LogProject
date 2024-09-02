package com.hammer.dao;

import com.hammer.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hammer_teng
 * @since 2024-08-12
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<User> {

}
