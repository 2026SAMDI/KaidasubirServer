package com.example.kaidasubirserver.domain.user.repository;

import com.example.kaidasubirserver.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 유저 엔티티의 DB 접근을 담당하는 레포
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email); // 이메일로 사용자 조회


}