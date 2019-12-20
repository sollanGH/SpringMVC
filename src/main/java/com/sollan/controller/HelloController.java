package com.sollan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author sollan
 * @RequestMapping在类上使用则代表方法的父路径
 * 属性说明：
 * 1.value、Path：指定访问路径，当没有其他属性时，可以不用声明
 * 2.method：规定请求方式
 * 3.params:规定请求此方法时必须传入username一个参数。若规定了值，则值必须与规定的"tomato"一致才能被访问
 *
 */

//控制器

@Controller
@RequestMapping("/user")
public class HelloController {

   @RequestMapping("/theWorld")
   public String theWorld(){

        System.out.println("执行了theWorld()方法，并跳转到了success.jsp页面");

        return "success";
   }

    @RequestMapping(value = "/theWorld2",method = {RequestMethod.POST},params = {"username=tomato"})
    public String theWorld2(){

        System.out.println("执行了这个方法，并跳转了页面");

        return "success";
    }


}


































