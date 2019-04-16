/**
 * Copyright (C), 2019, 金科教育
 * FileName: HelloService
 * Author:   zyl
 * Date:     2019/4/12 15:36
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br>
 * 〈A〉
 *
 * @author zyl
 * @create 2019/4/12
 * @since 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        // 第一个参数代表调用生产者的服务路径  第二个参数代表传入的参数类型
        return restTemplate.getForObject("http://SERVICE-PROVIDER/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
