package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/" ,description = "这是我全部的get方法")
public class MyGetMethod {

    /**
     *
     * @param response
     * @return
     */
    @RequestMapping(value = "/getCookies", method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法获取到cookies值",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜你获得cookies成功";
    }

    /**
     * 要求客户端必须携带cookie访问，判断cookie是否正确
     */
    @RequestMapping(value = "/get/with/cookies", method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端必须携带cookie访问",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "你必须携带cookie信息";
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "恭喜你访问成功";
            }
        }

        return "你必须携带cookie信息";
    }

    /**
     * 开发需要携带参数才能访问的get请求
     * 第一种方式：url：key=value&&key=value
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "开发需要携带参数才能访问的get请求1",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,@RequestParam Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("鞋子",400);
        myList.put("衣服",300);
        return myList;
    }

    /**
     * 开发需要携带参数才能访问的get请求
     * 第二种方式：url：ip:port/get/with/param/10/20
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "开发需要携带参数才能访问的get请求2",httpMethod = "GET")
    public Map getGetList(@PathVariable Integer start,@PathVariable Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("鞋子",400);
        myList.put("衣服",300);

        return myList;
    }
}
