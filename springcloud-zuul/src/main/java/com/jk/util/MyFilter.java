/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: MyFilter
 * Author:   史超
 * Date:     2019/4/16 11:31
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.util;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class MyFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
