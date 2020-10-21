package com.hx.test.selfTest.streamTest;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: leetcode
 * @description:
 * @author: hux
 * @create: 2020-09-10 17:38
 **/
public class StreamUse {
    private static List<String> createSomeData() {
        User user = new User();
        user.setName("张三");
        user.setSex("男");
        user.setJob("工程师");

        User user1 = new User();
        user1.setName("李四");
        user1.setSex("男");
        user1.setJob("金融");

        User user2 = new User();
        user2.setName("王五");
        user2.setSex("男");
        user2.setJob("旅游业");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        //将User对象的list转化name对象的list
        return users.stream().map(u -> u.getName()).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        //遍历输出
        createSomeData().forEach(name -> System.out.println(name));
        System.out.println("----------分割线----------------");
        //遍历输出
        createSomeData().forEach(System.out::println);

        //过滤
        createSomeData().stream().filter(name -> name.startsWith("张")).forEach(System.out::println);
        System.out.println("----------分割线----------------");

        //合并俩个流
        List<String> data1 = createSomeData();
        List<String> data2 = createSomeData();
        Stream.concat(data1.stream(), data2.stream()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("----------分割线----------------");


    }
    @Test
    public void test(){
        User user = new User();
        user.setName("张三");
        user.setSex("男");
        user.setJob("工程师");

        User user1 = new User();
        user1.setName("李四");
        user1.setSex("男");
        user1.setJob("金融");

        User user2 = new User();
        user2.setName("王五");
        user2.setSex("男");
        user2.setJob("旅游业");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        //将User对象的list转化name对象的list
         users.stream().map(u -> u.getName()).collect(Collectors.toList()).forEach(System.out::println);
//        users.forEach(System.out::println);
        System.out.println(users.toString());
    }


    @Test
    public void testMap(){

        List<Map<String, Object>> maps = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("a",null);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("a",null);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("a",1);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("a",1);

        maps.add(map);
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);

        List<Double> dataList = maps.stream()
                .filter(Objects::nonNull)
                .flatMap(singleMap -> singleMap.values().stream().filter(Objects::nonNull))
                .map(item -> Double.valueOf(item.toString()))
                .collect(Collectors.toList());

        System.out.println("ok");

    }

}
