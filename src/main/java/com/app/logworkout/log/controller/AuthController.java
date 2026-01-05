package com.app.logworkout.log.controller;


import com.app.logworkout.log.dto.AuthResponseDTO;
import com.app.logworkout.log.dto.UserLoginDTO;
import com.app.logworkout.log.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService serv;

    public AuthController(AuthService serv) {
        this.serv = serv;
    }

    @PostMapping("/login")
    public AuthResponseDTO login(@RequestBody UserLoginDTO dto) {
        return serv.login(dto);
    }
}

