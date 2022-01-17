package com.example.webserverhtb.Service;

import com.example.webserverhtb.model.HTBFlag;
import com.example.webserverhtb.model.HTBFlagPostOne;
import org.springframework.stereotype.Service;

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
}
