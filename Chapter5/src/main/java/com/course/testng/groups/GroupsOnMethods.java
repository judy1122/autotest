package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


/**
 * 输出如下：
 * 这是服务端组运行前的方法
 * 这是服务端组的测试方法1111
 * 这是服务端组的测试方法2222
 * 这是服务端组运行后的方法
 * 这是客户端组运行前的方法
 * 这是服务端组的测试方法3333
 * 这是服务端组的测试方法4444
 * 这是客户端组运行后的方法
 *
 *
 * 即，goroups通过名字相关联
 */

public class GroupsOnMethods {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是服务端组的测试方法3333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是服务端组的测试方法4444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行前的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行后的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行前的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行后的方法");
    }


}
