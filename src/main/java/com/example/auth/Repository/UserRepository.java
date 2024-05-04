package com.example.auth.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.auth.Model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String username);
}
