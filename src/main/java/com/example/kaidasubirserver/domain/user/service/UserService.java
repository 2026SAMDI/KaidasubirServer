package com.example.kaidasubirserver.domain.user.service;

import com.example.kaidasubirserver.domain.user.dto.request.LoginRequest;
import com.example.kaidasubirserver.domain.user.dto.request.SignupRequest;
import com.example.kaidasubirserver.domain.user.entity.User;
import com.example.kaidasubirserver.domain.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String signup(SignupRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "이미 존재하는 이메일입니다.";
        }

        User user = new User(
                request.getUsername(),
                request.getEmail(),
                request.getPassword()
        );

        userRepository.save(user);

        return "회원가입 성공";
    }

    public String login(LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElse(null);

        if (user == null) {
            return "존재하지 않는 사용자";
        }

        if (!user.getPassword().equals(request.getPassword())) {
            return "비밀번호 오류";
        }

        return "로그인 성공";
    }
}