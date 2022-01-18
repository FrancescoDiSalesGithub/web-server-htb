package com.example.webserverhtb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hintController
{

    @GetMapping("/hint")
    public String hint()
    {
        return "you must be weak to ask me for help... check my post version";
    }

    @PostMapping("/hint")
    public String hintPost()
    {
        return "TO-DO";
    }

}
