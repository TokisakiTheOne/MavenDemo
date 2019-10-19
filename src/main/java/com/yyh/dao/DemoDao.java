package com.yyh.dao;

import com.yyh.po.Demo;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-10-19-11:21
 */
public interface DemoDao {

    /**
     * 查询全部
     * @return
     */
    List<Demo> selectAll();
}
