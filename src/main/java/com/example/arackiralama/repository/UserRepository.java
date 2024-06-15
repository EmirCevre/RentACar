package com.example.arackiralama.repository;

import com.example.arackiralama.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
