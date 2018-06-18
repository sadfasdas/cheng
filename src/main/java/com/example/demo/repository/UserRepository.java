package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017-11-16.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
