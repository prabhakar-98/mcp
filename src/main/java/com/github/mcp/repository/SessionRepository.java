package com.github.mcp.repository;

import com.github.mcp.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, String> {
    // You can add custom query methods here if needed
    Session findBySessionID(String sessionID);
    Session findByUserID(String userID);
    Session findByLastAccessTime(long lastAccessTime);
    Session findByCreatedAt(long createdAt);
    Session findByIsActive(boolean isActive);


}
