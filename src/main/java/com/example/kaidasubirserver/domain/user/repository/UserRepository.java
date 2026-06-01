package com.example.kaidasubirserver.domain.user.repository;

import com.example.kaidasubirserver.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> { //User = 관리 할 Entity Long = Entity 타입

    Optional<User> findByUsername(String username); //username으로 조회

    boolean existsByUsername(String username);
}