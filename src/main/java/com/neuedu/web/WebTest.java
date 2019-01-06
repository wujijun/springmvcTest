package com.neuedu.web;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class WebTest {
    private IUserService service = new UserServiceImpl();
    @RequestMapping("/a.do")
    public String web(Map map) {
        map.put("list", "giiuiuhfkjgi");
        return "a";
    }
    @RequestMapping("/b.do")
    public String b(User user){
        System.out.println(user);
        return "b";
    }

    @RequestMapping("/lists.do")
    public String getLists(ModelMap map){
        List<User> list = service.getLists();
        System.out.println(list);
        map.put("lists",list);
     return "lists";
    }
    @RequestMapping("/delete.do")
    public String delete(int id,ModelMap map){
        service.delete(id);
        return "redirect:lists.do";
    }
    @RequestMapping("/update.do")
    public String update(int id, ModelMap map){
        User user = service.getOne(id);
        map.addAttribute("User",user);
        System.out.println(user);
        return "update";
    }
    @RequestMapping("/doUpdate.do")
    public String doUpdate(User user){
        System.out.println( user.getEmail());
        System.out.println(user);
        service.update(user);
        return "redirect:lists.do";
    }
    @RequestMapping("/add.do")
    public String add(){
        return "add";
    }
    @RequestMapping("/doAdd.do")
    public String doAdd(User user){
        System.out.println(user);
        service.insert(user);
        return "redirect:lists.do";
    }
}
