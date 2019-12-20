package com.sollan.controller;

import com.sollan.domain.Account;
import com.sollan.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @author 16190
 * @date 2019/11/28 19 56
 * @description
 *
 */

@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     *  [1]请求参数的绑定
     *  若请求页面传来的参数名称与方法参数名一致，SpringMVC则会自动将传来的参数赋值给方法的参数
     */
    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("方法被执行了...");
        System.out.println("传递的用户名为：" + username);
        System.out.println("传递的密码为：" + password);
        return "success";
    }

    /**
     * [2]封装前端数据
     *  1.从JSP表单传来的参数会被Account类接收
     *  2.会把Account类属性与表单属性进行匹配
     *  3.表单中name与JavaBean属性名一致则直接赋值
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("Account类获取到了表单数据！");
        System.out.println(account);
        return "success";
    }

    /**
     *  [3]自定义类型转换器
     *  1.前端的2019/11/29的字符串能自动转换为日期类型
     *  2.需要自定义转换器类
     *  3.需在springMVC.xml注册文件中进行转换器类注册
     *
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("User类获取到了表单的特殊数据");
        System.out.println(user);
        return "success";
    }

    /**
     * [4]获取Servlet原生对象
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest reuqest, HttpServletResponse response){
        System.out.println("获取了Servlet原生对象");
        //获取请求、响应对象
        System.out.println(reuqest);
        System.out.println(response);

        //获取session对象
        HttpSession session = reuqest.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        return "success";
    }
}





















