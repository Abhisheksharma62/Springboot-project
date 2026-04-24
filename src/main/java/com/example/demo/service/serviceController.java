package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class serviceController {
@Autowired
private service us;
@PostMapping("/user")
public List<user>save(@RequestBody List<user>User)
{
return us.saveUser(User);
}
@GetMapping("/User")
public List<user>getAlluser()
{
    return us.getAlluser();
}
@GetMapping("/User/{id}")
public user getUserById(@PathVariable int id)
{
    return us.getUserById(id);
}
}
