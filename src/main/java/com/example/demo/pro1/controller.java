package com.example.demo.pro1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web")
public class controller {
@Autowired
private Service1 repo;
@PostMapping
public String reciveMessage(@RequestBody UserDto dto)
{
    System.out.println(dto.getMessage());
    return repo.getReply(dto.getMessage());
}
}

