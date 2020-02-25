package com.sanelee.springclouddemo.controller;

import com.sanelee.springclouddemo.entity.User;
import com.sanelee.springclouddemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return userRepository.findAll(index,limit);
    }
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long id){
        return userRepository.findById(id);
    }
    @GetMapping("/count")
    public int count(){
        return userRepository.count();
    }
    @PostMapping("/save")
    public void save(@RequestBody User user){//@RequestBody 将json格式转换成User对象
        userRepository.save(user);
    }
    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.update(user);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }
}
