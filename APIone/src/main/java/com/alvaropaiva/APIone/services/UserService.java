package com.alvaropaiva.APIone.services;

import com.alvaropaiva.APIone.entities.User;
import com.alvaropaiva.APIone.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findALl(){
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return  obj.get();
    }


}