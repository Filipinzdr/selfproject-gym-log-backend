package com.app.logworkout.log.controller;

import com.app.logworkout.log.domain.User;
import com.app.logworkout.log.dto.UserCreateDTO;
import com.app.logworkout.log.dto.UserResponseDTO;
import com.app.logworkout.log.service.UserService;
import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService serv;

    public UserController(UserService serv) {
        this.serv = serv;
    }

    @GetMapping("/me")
    public UserResponseDTO me(@AuthenticationPrincipal User user){
        return serv.getMe(user);

    }


}
