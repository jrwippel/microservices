package com.jrwsolucoesti.course.config;

import com.jrwsolucoesti.course.entities.User;
import com.jrwsolucoesti.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Jackson Ricardo Wippel", "jrwippel@hotmail.com", "988888888", "123456");
        User u2 = new User(null, "Priscila A. S. Wippel", "prysol@hotmail.com", "977777777", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
