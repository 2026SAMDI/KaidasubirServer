package com.example.kaidasubirserver.domain.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor // JPA가 객체를 생성할 때 사용하는 기본 생성자
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // 빈 값 X 중복 X
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    // 회원가입 시 사용할 생성자
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}