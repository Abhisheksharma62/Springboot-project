package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class service {
@Autowired
private UserRepository repo;
public List<user>saveUser(List<user>Users)
{
    return repo.saveAll(Users);
}
public List<user>getAlluser()
{
    return repo.findAll();
}
public user getUserById(int id)
{
    return repo.findById(id).orElse(null);
}
}
