package com.angelaviles.contactlist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelaviles.contactlist.dao.UserDAO;
import com.angelaviles.contactlist.modals.User;

@Service
public class UserService {

    @Autowired
    private UserDAO userRepository;

    public List<User> findAll() {

        Iterable<User> it = userRepository.findAll();

        List<User> users = new ArrayList<User>();
        it.forEach(e -> users.add(e));

        return users;
    }
    
    public User get(String nickname) {
		return userRepository.findById(nickname).get();
    }
    
    public User save(User user) {
    	return userRepository.save(user);
    }

    public void delete(String nickname) {

        userRepository.deleteById(nickname);
    }
}