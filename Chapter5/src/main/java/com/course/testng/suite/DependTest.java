package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * 使用dependsOnMethods后，就算只执行test2，也会执行test1
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
