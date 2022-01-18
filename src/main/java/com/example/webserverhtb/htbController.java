package com.example.webserverhtb;

import com.example.webserverhtb.Service.HTBService;
import com.example.webserverhtb.model.HTBFlag;
import com.example.webserverhtb.model.HTBFlagPostOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@RestController
public class htbController 
{

    @Autowired
    private HTBService service;

    @GetMapping("/message")
    public String messageGet()
    {
        return "HTB - GET DONE";
    }

    @PostMapping("/password")
    public String messagePost(@RequestBody HTBFlag htbFlag)
    {
        HTBFlagPostOne flag = service.getPostOne(htbFlag);
        return flag.getFlag();
    }

    @PostMapping(value = "/login",consumes = {"text/plain"})
    public String xformPost()
    {
        return "";
    }

    @GetMapping("/cookie")
    public String cookieFlag(HttpServletResponse response)
    {
        return service.cookie(response);
    }

    @GetMapping("/cookiepot")
    public String readCookieFlag(@CookieValue (value = "flag",defaultValue = "check the name") String flag)
    {
        return service.cookieFlag(flag);
    }


}
