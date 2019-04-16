/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   zyl
 * Date:     2019/3/21 10:31
 * Description: a
 * History:
 */
package com.jk.model;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/3/21
 * @since 1.0.0
 */
public class Users implements Serializable{


    private static final long serialVersionUID = -9083290564183544110L;

    private String id;

    private long product_price;

    private String product_sell_point;

    private String product_title;

    private int product_num;

    public String getProduct_sell_point() {
        return product_sell_point;
    }

    public void setProduct_sell_point(String product_sell_point) {
        this.product_sell_point = product_sell_point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public long getProduct_price() {
        return product_price;
    }

    public void setProduct_price(long product_price) {
        this.product_price = product_price;
    }

    public int getProduct_num() {
        return product_num;
    }

    public void setProduct_num(int product_num) {
        this.product_num = product_num;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", product_price=" + product_price +
                ", product_sell_point='" + product_sell_point + '\'' +
                ", product_title='" + product_title + '\'' +
                ", product_num=" + product_num +
                '}';
    }
}
