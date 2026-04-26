package com.example.demo.pro1;

import org.springframework.stereotype.Service;

@Service
public class Service1 {

    public String getReply(String msg)
    {
        if(msg==null)
        {
            return "Message is empty";
        }
        if(msg.equalsIgnoreCase("hi"))
        {
            return "Hello";
        }
        else if(msg.equalsIgnoreCase("bye"))
        {
            return "Goodbye";
        }
        else{
            return "Invalid";
        }
    }
}
