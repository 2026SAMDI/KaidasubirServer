package com.example.kaidasubirserver.domain.user.controller;

import com.example.kaidasubirserver.domain.user.entity.User;
import com.example.kaidasubirserver.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/login")
    public String login(
            @RequestParam String email,
            @RequestParam String password,
            Model model
    ) {
        User user = userRepository.findByEmail(email).orElse(null);

        // 이메일과 비밀번호가 모두 일치하는지 확인
        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("message", "로그인 성공 >< ~❤️");
        } else {
            model.addAttribute("message", "이메일 또는 비밀번호가 올바르지 않습니다 ㅜ_ㅜ");
        }

        return "result"; // 결과 반한
    }
}