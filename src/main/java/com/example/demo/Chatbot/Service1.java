package com.example.demo.Chatbot;

import org.springframework.stereotype.Service;

@Service
public class Service1 {

    public String getReply(String msg)
    {
        if(msg==null)
        {
            return "Message is empty";
        }
        if(msg.equalsIgnoreCase("Hi"))
        {
            return "Hello";
        }
        else if(msg.equalsIgnoreCase("Bye"))
        {
            return "Goodbye";
        }
        else{
            return "Invalid";
        }
    }
}
