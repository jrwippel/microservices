package com.jrwsolucoesti.course.resources;

import com.jrwsolucoesti.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource
{
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Jackson", "jackson.wippel@gmail.com", "47 99934-6159", "123456");
        return ResponseEntity.ok().body(u);
    }
}
