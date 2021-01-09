package com.suleyman.hoaxifywebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  ErrorCode {
    USERNAME_NOT_NULL(400,"Username kullanılmaktadır.");

    private int code;
    private String message;
}
