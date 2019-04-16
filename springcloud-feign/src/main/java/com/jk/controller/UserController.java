/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: UserController
 * Author:   史超
 * Date:     2019/4/14 16:47
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Administrator
 * @create 2019/4/14
 * @since 1.0.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    //查询树
    @GetMapping("/tree/findTree")
    @ResponseBody
    public List<TreeBean> findTree(){

        return userService.findTree();
    }

    @GetMapping("/user/queryUserList")
    @ResponseBody
    public List<User> queryUserList(){

        return userService.queryUserList();
    }


    //新增
    @RequestMapping(value="/user/saveUser",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public void saveUser(User user){
        if (user.getUserId()==null) {
            userService.saveUser(user);
        } else {
            userService.updateUser(user);
        }
    }

    //删除
    @GetMapping("/user/deleteAll")
    @ResponseBody
    public Boolean deleteAll(@RequestParam("ids") Integer[] ids){
        try {
            userService.deleteItem(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //回显
    @PostMapping("/user/findUserById")
    @ResponseBody
    public User findUserById(@RequestParam("shopId") Integer shopId){
        User user=userService.findUserById(shopId);
        return user;
    }
}
