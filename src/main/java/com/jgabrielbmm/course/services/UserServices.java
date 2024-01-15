package com.jgabrielbmm.course.services;

import com.jgabrielbmm.course.entities.User;
import com.jgabrielbmm.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }


    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        System.out.println(user);
        return user.get();
    }


}
