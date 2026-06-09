package com.example.kaidasubirserver.domain.user.dto.request;

// 회원가입 요청 데이터를 받는 request

public class SignupRequest {

    private String username;
    private String email;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}