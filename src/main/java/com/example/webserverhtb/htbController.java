package com.example.webserverhtb;

import com.example.webserverhtb.Service.HTBService;
import com.example.webserverhtb.model.HTBFlag;
import com.example.webserverhtb.model.HTBFlagPostOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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




}
