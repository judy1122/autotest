package com.course.testng.suite;

import org.testng.annotations.*;

/**
 * 运行结果：
 * before suite 运行啦！
 * 这是beforeTest
 * 淘宝登录成功啦
 * 这是afterTest
 * 这是beforeTest
 * 支付成功啦
 * 这是afterTest
 * after suite 运行啦！
 *
 * 即，只有before suite和beforeTest在其中是生效的,即对应于xml文件中的suite和test标签
 */

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行啦！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行啦！");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("这是beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("这是afterTest");
    }

    //x
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是afterMethod");
    }

    //x
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是afterClass");
    }
}
