package com.course.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试方法，test默认为true
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ingore1执行！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ingore2执行！");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ingore3执行！");
    }
}
