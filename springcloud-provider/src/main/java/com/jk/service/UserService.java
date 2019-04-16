/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: UserService
 * Author:   史超
 * Date:     2019/4/14 16:16
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.TreeBean;
import com.jk.model.User;
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
public class UserService {
    @Autowired
    private UserMapper userMapper;


    //左侧树
    @GetMapping("/tree/findTree")
    @ResponseBody
    public List<TreeBean> findTree(){
        int pid=0;
        List<TreeBean> list = getTreeBeans(pid);
        return list;
    }

    private List<TreeBean> getTreeBeans(int pid) {
        List<TreeBean> list = userMapper.findTree(pid);
        for (TreeBean treeBean : list) {
            Integer id = treeBean.getId();
            List<TreeBean> nodes = getTreeBeans(id);
            if(nodes.size()<=0){
                //无子节点
                treeBean.setSelectable(true);
            }else{
                //有子节点
                treeBean.setSelectable(false);
                treeBean.setNodes(nodes);
            }
        }
        return list;
    }


    @GetMapping("/user/queryUserList")
    @ResponseBody
    List<User> queryUserList(){
        List<User> list=userMapper.queryUserList();
        return list;
    }


    //新增
    @PostMapping("/user/saveUser")
    @ResponseBody
    public void saveUser(@RequestBody User user){
        userMapper.saveUser(user);
    }


    //删除
    @DeleteMapping("/user/deleteAll")
    @ResponseBody
    public void deleteAll(@RequestParam("ids")  Integer[] ids){
        userMapper.deleteItem(ids);
    }

    //回显
    @GetMapping("/user/findUserById")
    @ResponseBody
    public User findUserById(@RequestParam("shopId") Integer shopId){
        return userMapper.findUserById(shopId);
    }


    @PutMapping("/user/update")
    @ResponseBody
    public void updateUser(@RequestBody User user){
        userMapper.updateUser(user);
    };
}
