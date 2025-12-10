package com.ytuce.wordlearningapp.controllers.auth;

import com.ytuce.wordlearningapp.controllers.auth.requests.LoginRequest;
import com.ytuce.wordlearningapp.controllers.auth.requests.RegisterRequest;
import com.ytuce.wordlearningapp.controllers.auth.responses.AuthResponse;
import com.ytuce.wordlearningapp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService auth;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest req) {
        return auth.register(req);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest req) {
        return auth.login(req);
    }

}
