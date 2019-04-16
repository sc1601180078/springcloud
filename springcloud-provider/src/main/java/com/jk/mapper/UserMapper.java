/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: UserMapper
 * Author:   史超
 * Date:     2019/4/14 16:20
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.mapper;

import com.jk.model.TreeBean;
import com.jk.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/4/14
 * @since 1.0.0
 */
public interface UserMapper {
    @Select("select * from t_tree where pid=#{value} ")
    List<TreeBean> findTree(int pid);
    @Select("select t.id userId,t.name userName,t.age userAge,t.password userPassword from t_user t")
    List<User> queryUserList();

    void saveUser(@RequestBody User user);

    void deleteItem(@RequestParam("ids") Integer[] ids);

    @Select("select t.id userId,t.name userName,t.age userAge from t_user t where id=#{value}")
    User findUserById(@RequestParam("shopId") Integer shopId);

    void updateUser(@RequestBody User user);
}
