package com.example.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kelly on 2018/12/11.
 */
public class MapSizeTest {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("apple", "新鲜的苹果");     //向列表中添加数据

        map.put("computer", "配置优良的计算机");   //向列表中添加数据

        map.put("book", "堆积成山的图书");     //向列表中添加数据

        System.out.println("Map集合大小为："+map.size());

    }
}
