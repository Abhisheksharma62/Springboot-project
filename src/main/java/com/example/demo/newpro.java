// package com.example.demo;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;


// @RestController
// public class newpro {
//     @Autowired
//     private User1Repository repo;
// @PostMapping("/")
// public User1 hello(@RequestBody User1 user)
// {
//     System.out.println(user.getId());
//     System.out.println(user.getName());
//     System.out.println(user.getAge());
//     //return" Data Received";
//     return repo.save(user);
// }
// @PostMapping("/hello")
// public List<User1>save(@RequestBody List<User1>user)
// {
//     for(User1 u:user)
//     {
//      System.out.println(u.getId());
//     System.out.println(u.getName());
//     System.out.println(u.getAge());
//     } 
//     return repo.saveAll(user);
// }
//post Api(Create)
// @PostMapping("/user")
// public User1 saveUser(@RequestBody User1 user)
// {
//     return repo.save(user);
// }
// //GET Api(All users)
// @GetMapping("/users")
// public List<User1>getAllUsers(){
//     return repo.findAll();
// }
// //GETAPi(by id)
// @GetMapping("/user/{id}")
// public User1 getUser(@PathVariable int id)
// {
//     return repo.findById(id).orElse(null);
// }
// //delete Api
// @DeleteMapping("/user/{id}")
// public String deleteUser(@PathVariable int id)
// {
// repo.deleteById(id);
// return"Deleted";
// } 
// }
