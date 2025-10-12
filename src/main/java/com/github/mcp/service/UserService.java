package com.github.mcp.service;

import com.github.mcp.model.User;
import com.github.mcp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    // You can add custom query methods here if needed
    public User findByUserID(String userID) {
        return userRepository.findByUserID(userID);
    }
    public User findByEmailId(String emailId) {
        return userRepository.findByEmailId(emailId);
    }
    public User createUser(User user)
    {
        return userRepository.save(user);
    }
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

}
