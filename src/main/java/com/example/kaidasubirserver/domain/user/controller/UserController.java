package com.example.kaidasubirserver.domain.user.controller;

import com.example.kaidasubirserver.domain.user.entity.User;
import com.example.kaidasubirserver.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        User user = userRepository.findByUsername(username).orElse(null);

        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            model.addAttribute("message", "로그인 성공");
        } else {
            model.addAttribute("message", "아이디 또는 비밀번호가 올바르지 않습니다");
        }

        return "result";
    }
}