package com.training.RelationalMapping.repo;

import com.training.RelationalMapping.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
