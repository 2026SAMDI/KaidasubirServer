package com.example.kaidasubirserver.domain.item.repository;

import com.example.kaidasubirserver.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}