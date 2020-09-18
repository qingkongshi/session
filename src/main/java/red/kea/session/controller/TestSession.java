package red.kea.session.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestSession {
    @RequestMapping("set/{name}")
    public void setSession(HttpSession seesion, @PathVariable("name") String name){
        seesion.setAttribute("user",name);
        System.out.println("设置成功");
    }

    @RequestMapping("get")
    public void getSession(HttpSession seesion){
        String user = (String)seesion.getAttribute("user");
        System.out.println(user);
    }



}
