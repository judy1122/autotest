package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation{
    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("这是测试用例2");
    }

    /**
     * BeforeTest和AfterMethod在每次方法执行时，都要执行一次
     * eg:
     * 这是before
     * 这是测试用例1
     * 这是after
     * 这是测试用例2
     * 这是after
     */

    @BeforeTest
    public void beforeMethod(){
        System.out.println("这是beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是afterMethod");
    }

    /**
     * BeforeClass和AfterClass，每次类执行的时候，才会执行一次
     * eg:
     * 这是beforeMethod
     * 这是beforeClass
     * 这是测试用例1
     * 这是afterMethod
     * 这是测试用例2
     * 这是afterMethod
     * 这是afterClass
     */

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是afterClass");
    }

}
