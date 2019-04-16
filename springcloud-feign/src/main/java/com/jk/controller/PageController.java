/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: PageController
 * Author:   史超
 * Date:     2019/4/14 17:51
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/4/14
 * @since 1.0.0
 */
@Controller
public class PageController {

    //跳转用户查询
    @GetMapping("/page/queryUser")
    public String queryUser(){
        return "user";
    }


    //跳转用户查询
    @GetMapping("/page/main")
    public String main(){
        return "main";
    }





    //跳转新增
    @GetMapping("/page/toAddShop")
    public String toAddShop(){
        return "toAddShop";
    }

    @GetMapping("/page/toUpdateUser")
    public String toUpdateUser(){
        return "toUpdateUser";
    }
}
