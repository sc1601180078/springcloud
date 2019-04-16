/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: UserService
 * Author:   史超
 * Date:     2019/4/14 16:48
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.util.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/4/14
 * @since 1.0.0
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface UserService extends UserServiceImpl{

}
