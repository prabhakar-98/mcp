package com.github.mcp.repository;

import com.github.mcp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // You can add custom query methods here if needed
    User findByUserID(String userID);
    User findByEmailId(String emailId);
    User findByName(String name);

}
