package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Deruke on 2019/3/15.
 */
public class TestSpringContextDemo {
//    protected static IQueryService queryService;

    //@Resource(name = "defaultMapOffsetCoordinator")
    //private static MapOffsetCoordinator mapOffsetCoordinator;

//    @BeforeClass
    public static void init(){
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
//                "spring.xml",
//                "spring-hibernate.xml",
//                "spring-mybatis.xml",
//                "spring-druid.xml",
//                "mybatis-config.xml"
//        });
//        queryService = (IQueryService) context.getBean("queryService");
        //mapOffsetCoordinator = (MapOffsetCoordinator) context.getBean("defaultMapOffsetCoordinator");
    }

    // 測試路線
    // 测试mybatis
//    @Test
    public void testMybatis(){
        String queryId = "stationinfo.linestandinfo";
        Map params = new HashMap();
        params.put("busno","SC9596");
//        List<Map<String, Object>> result = queryService.query(queryId, params);
//        System.out.println(result);

    }

//    @Test
    public void getterm(){
        List result = new ArrayList();
        String queryId = "getTermVersionInfoTermType";
        Map params = new HashMap();
        params.put("userId","1");
//        result = queryService.query(queryId,params);
        System.out.println(result);

    }
}
