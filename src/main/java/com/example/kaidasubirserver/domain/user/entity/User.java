package com.example.kaidasubirserver.domain.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder //이거 왜쓰는지 아시는분
@NoArgsConstructor
@Table

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id 번호 자동으로 올라감
    private Long id;

    private String username;

    private String password;

    public User(String username, String password) { // 새 유저 만들 때 사용
        this.username = username;
        this.password = password;
    }
}
