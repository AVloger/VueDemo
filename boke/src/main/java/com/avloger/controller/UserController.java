package com.avloger.controller;


import com.avloger.common.lang.Result;
import com.avloger.entity.User;
import com.avloger.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 深林中的书海
 * @since 2021-02-05
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public  Object index(){
        User user = userService.getById(1);
        return Result.succ(200,"操作成功",user);
    }

    @PostMapping("/save")
    public  Result save(@Validated @RequestBody User user){

        return Result.succ(user);
    }
}

