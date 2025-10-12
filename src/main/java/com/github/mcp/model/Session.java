package com.github.mcp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "Session")
public class Session {
    String sessionID;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userID")  // foreign key
    private User user;
    long lastAccessTime;
    @CreatedDate
    private LocalDateTime createdAt;

    boolean isActive;



    public Session(String sessionID, User user)
    {
        this.sessionID=sessionID;
        this.user=user;
        this.lastAccessTime=System.currentTimeMillis();
        this.createdAt=LocalDateTime.now();
        this.isActive=true;
    }
    public String getSessionID() {
        return sessionID;
    }
    public String getUserID() {
        return user.getUserID();
    }


}
