package com.sollan.controller;

import com.sollan.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @author 16190
 * @date 2019/11/29 16 35
 * @description 常用注解的测试
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"massage"})     //将message存储到了session域中
public class AnnoController {

    /**
     * @RequestParam(name="parem")注解[1]
     * 1.在方法参数前面声明，指定前端传递的具体参数赋值给方法参数
     * 2.好处：方法参数名不必再和前端数据名相同了
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("指定具体的方法参数接收前端数据:"+username);
        return "success";

    }

    /**
     * @RequestBody注解[2]
     * 1.获取到请求体的内容，获取了username和age
     * 2.对于JSON数据友好
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("获取请求体内容:"+body);
        return "success";

    }

    /**
     * @PathVariable注解[3]
     * 在url中包含了参数，并取到
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("获取了url中的参数:"+id);
        return "success";

    }

    /**
     * @RequestHeader不常用注解[4]
     * 获取请求的头
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("获取请求头的值:"+header);
        return "success";

    }

    /**
     * @CookieValue不常用注解[5]
     * 获取cookie的值
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("获取请求头的值:"+cookieValue);
        return "success";

    }

    /**
     * @ModelAttribute注解[6]
     * 1.声明在方法上时，此方法会优先执行，之后再执行url路径指定的方法
     * 2.若表单提交的数据不完整，此注解可防止 空值覆盖原数据
     *     其原理为：利用[先行方法]获取表单的用户名，并根据用户名查询其他属性信息
     *     将原信息传递给[后行方法]，若表单的某项数据为空，则不进行原数据覆盖
     * 3.参数中声明的@ModelAttribute("abc")根据key值获取了Map中的user对象
     * 4.Map<>是此注解钦定的数据结构
     * 5.简单总结：先获取数据库中原本的数据进行垫底，表单中为空的就显示原来的数据
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("Date项保留了原来的数据，而不是被空字符串覆盖了:"+user);
        return "success";
    }

    @ModelAttribute
    public void showModel(String uname, Map<String,User> map){
        System.out.println("优先执行的方法：showModel()");
        //这里模拟了获取数据库中的数据，并将其存储在Map中
        User user=new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc",user);

    }

//    @ModelAttribute
//    public User showModel(String uname){
//        System.out.println("优先执行的方法：showModel()");
//        //根据表单传过来的uname来查询数据库里相关的数据，并备份起来
//        User user=new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        //这个返回值是返回给testModelAttribute()方法的
//        return user;
//    }

    /**
     * @SessionAttributes注解[7]
     * 1.此注解需标注在类上
     * 2.可将数据存储到Session中，实现方法间参数共享
     * 3.存入的值可在成功跳转界面直接用EL表达式获取（Maven中的jsp声明需添加isELIgnored="false"开启EL注解）
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(ModelMap modelMap,String arg){
        System.out.println("执行了testSessionAttributes方法:"+arg);
        //存入值
        modelMap.addAttribute("message",arg);
        //取出值
        String msg = (String) modelMap.get("message");
        System.out.println(msg);

        return "success";

    }

}






















