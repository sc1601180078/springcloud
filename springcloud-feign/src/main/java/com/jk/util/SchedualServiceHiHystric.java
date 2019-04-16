/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: SchedualServiceHiHystric
 * Author:   史超
 * Date:     2019/4/15 14:35
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.util;

import com.jk.model.TreeBean;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/4/15
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements UserService {

    @Override
    public List<TreeBean> findTree() {
        return null;
    }

    @Override
    public List<User> queryUserList() {
        List<User> list=new ArrayList<>();
        User user = new User();
        user.setUserName("报错");
        list.add(user);
        return list;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteItem(Integer[] ids) {

    }

    @Override
    public User findUserById(Integer shopId) {
        return null;
    }
}
