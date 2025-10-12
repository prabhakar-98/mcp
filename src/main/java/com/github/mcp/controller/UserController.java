package com.github.mcp.controller;

import com.github.mcp.model.Session;
import com.github.mcp.model.User;
import com.github.mcp.repository.SessionRepository;
import com.github.mcp.service.UserService;
import com.github.mcp.utility.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // In a real application, you would inject a UserService here
    @Autowired
    private UserService userService;
    private SessionRepository sessionRepository;

    @GetMapping("api/v1/user")
    public ResponseEntity<ApiResponse<User>> createUser(@PathVariable("state") String state, @PathVariable("code") String code)
    {
        //api call to github for token
        // then user

        User user=new User("udgfyufhj","asdfgsdh","vcdshbv@gmail.com");
        try
        {
            user= userService.createUser(user);
            Session session=new Session(state,user);
            sessionRepository.save(session);
            return ResponseEntity.ok(new ApiResponse<User>("sucessfully created user",user,"success"));
        }
        catch (Exception e)
        {
            return ResponseEntity.ok(new ApiResponse<User>("failed to create user",null,"failed"));
        }


    }

}
