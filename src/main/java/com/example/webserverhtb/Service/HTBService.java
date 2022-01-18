package com.example.webserverhtb.Service;

import com.example.webserverhtb.model.HTBFlag;
import com.example.webserverhtb.model.HTBFlagPostOne;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class HTBService
{
    public HTBFlagPostOne getPostOne(HTBFlag htbFlag)
    {
        HTBFlagPostOne flagPostOne = new HTBFlagPostOne();
        if(htbFlag.getPassword().equals(flagPostOne.getFlag()))
        {
            return flagPostOne;
        }

        flagPostOne.setFlag("not yet...");
        return flagPostOne;

    }

    public String cookie(HttpServletResponse response)
    {
        Cookie cookie = new Cookie("flag","HTB{COOKIE}");
        response.addCookie(cookie);

        return "check my cookie";
    }

    public String cookieFlag(String flag)
    {
        if(flag.equals("HTB"))
        {
            return "HTB{I can manipulate cookies}";
        }

        return "not the right cookie... try setting a new one";
    }

}
