package com.jrwsolucoesti.course.repositories;

import com.jrwsolucoesti.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
