// package com.example.demo;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class User2 {
// @Autowired
// private Users2Repository repo;
// @PostMapping("/users")
// public List<users2> save(@RequestBody List<users2> user)
// {
//     return repo.saveAll(user);
// }
// @GetMapping("/user")
// public List<users2> getAllusers2()
// {
//     return repo.findAll();
// }
// @GetMapping("/User/{id}")
// public users2 getUser(@PathVariable int id)
// {
//     return repo.findById(id).orElse(null);
// }
// @DeleteMapping("/User/{id}")
// public String deleteUser(@PathVariable int id)
// {
// repo.deleteById(id);
// return "Deleted";
// }
// @PutMapping("/User/{id}")
// public users2 update(@PathVariable int id,@RequestBody users2 newUser)
// {
//     users2 oldUser=repo.findById(id).orElse(null);
//     if(oldUser!=null)
//     {
// oldUser.setName(newUser.getName());
// oldUser.setAge(newUser.getAge());
// return repo.save(oldUser);
//     }
//     else{
//         return null;
//     }
// }
// }
