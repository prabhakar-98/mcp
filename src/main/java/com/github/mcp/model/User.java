package com.github.mcp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "User")
public class User {
    private String userID;
    private String name;
    private String emailId;
    @CreatedDate
    private LocalDateTime createdAt;

    private  LocalDateTime updateAt;

    public User(String userID, String name, String emailId)
    {
         this.userID=userID;
         this.name=name;
         this.emailId=emailId;
    }
    public String getUserID() {
        return userID;
    }
}
