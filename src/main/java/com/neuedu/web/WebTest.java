package com.neuedu.web;

import com.neuedu.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WebTest {
    @RequestMapping("/a.do")
    public String web(Map map){
        map.put("list","giiuiuhfkjgi");
        return "a";
    }
    @RequestMapping("/b.do")
    public String b(User user){
        System.out.println(user);
        return "b";
    }
}
