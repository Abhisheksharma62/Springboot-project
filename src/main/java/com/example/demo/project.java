package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class project {
@PostMapping("/reg")
public String register(@RequestBody Pro pro)
{
return "Username: " + pro.getName() + " Password: " + pro.getPassword();
}
@PostMapping("/login")
public String login(@RequestBody Pro pro)
{
    
    if(pro.getName().equals("Abhishek")&&pro.getPassword().equals("123"))
    {
        return "Login Successful";
    }
    else
    {
        return "Wrong info";
    }
}
}
