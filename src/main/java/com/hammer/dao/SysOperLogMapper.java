package com.hammer.dao;

import com.hammer.entity.SysOperLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 操作日志记录 Mapper 接口
 * </p>
 *
 * @author hammer_teng
 * @since 2024-08-12
 */
@Mapper
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {

}
