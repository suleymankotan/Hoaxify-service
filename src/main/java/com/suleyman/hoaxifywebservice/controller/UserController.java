package com.suleyman.hoaxifywebservice.controller;

import com.suleyman.hoaxifywebservice.model.request.RegisterRequest;
import com.suleyman.hoaxifywebservice.model.request.VerifyCodeRequest;
import com.suleyman.hoaxifywebservice.model.response.BaseResponse;
import com.suleyman.hoaxifywebservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public BaseResponse userRegister(@RequestBody @Valid RegisterRequest registerRequest){
        return userService.userRegister(registerRequest);
    }

    @PutMapping("/register/verify")
    public BaseResponse userRegisterVerifyCode(@RequestBody @Valid VerifyCodeRequest verifyCodeRequest){
        return userService.userActiveEnable(verifyCodeRequest);
    }
}
