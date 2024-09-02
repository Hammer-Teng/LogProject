package com.hammer.controller;

import com.hammer.annotation.Log;
import com.hammer.entity.Result;
import com.hammer.entity.User;
import com.hammer.enums.BusinessType;
import com.hammer.service.UserInfoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hammer_teng
 * @since 2024-08-12
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }


    /**
     * 获取用户信息
     *
     */
    @Log(title = "获取用户信息", businessType = BusinessType.OTHER)
    @Operation(description = "获取用户信息")
    @GetMapping("/{id}")
    public Result<User> getUser(@PathVariable Long id) {
        return Result.success(userInfoService.getById(id));
    }


    /**
     * 插入用户信息
     *
     */
    @Log(title = "插入用户信息", businessType = BusinessType.INSERT)
    @Operation(description = "插入用户信息")
    @PostMapping("/insert")
    public Result<String> insertUser(@RequestBody User userInfo) {
        boolean saved = userInfoService.save(userInfo);
        if (!saved) {
            return Result.error("插入失败");
        }
        return Result.success();
    }

    /**
     * 更新用户信息
     *
     */
    @Log(title = "更新用户信息", businessType = BusinessType.UPDATE)
    @Operation(description = "更新用户信息")
    @PostMapping("/update/{id}")
    public Result<String> updateUser(@RequestBody User userInfo) {
        boolean updated = userInfoService.updateById(userInfo);
        if (!updated) {
            return Result.error("更新失败");
        }
        return Result.success();
    }

    /**
     * 删除用户信息
     */
    @Log(title = "删除用户信息", businessType = BusinessType.DELETE)
    @Operation(description = "删除用户信息")
    @PostMapping("/delete/{id}")
    public Result<String> deleteUser(@PathVariable Long id) {
        boolean deleted = userInfoService.removeById(id);
        if (!deleted) {
            return Result.error("删除失败");
        }
        return Result.success();
    }
}
