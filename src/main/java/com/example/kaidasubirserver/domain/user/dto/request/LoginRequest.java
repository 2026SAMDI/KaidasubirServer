package com.example.kaidasubirserver.domain.user.dto.request;

// 로그인 요청 데이터를 받는 request
public class LoginRequest {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}