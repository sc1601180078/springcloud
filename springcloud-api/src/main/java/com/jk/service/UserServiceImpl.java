/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: UserServiceImpl
 * Author:   史超
 * Date:     2019/4/15 13:25
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.TreeBean;
import com.jk.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/4/15
 * @since 1.0.0
 */
public interface UserServiceImpl {
    @GetMapping("/tree/findTree")
    List<TreeBean> findTree();

    //查询
    @GetMapping("/user/queryUserList")
    List<User> queryUserList();
    //新增
    @PostMapping("/user/saveUser")
    void saveUser(@RequestBody User user);
    //修改
    @PutMapping("/user/update")
    void updateUser(@RequestBody User user);
    //删除
    @DeleteMapping("/user/deleteAll")
    void deleteItem(@RequestParam("ids") Integer[] ids);
    //回显
    @GetMapping("/user/findUserById")
    User findUserById(@RequestParam("ids") Integer shopId);
}
