package com.suleyman.hoaxifywebservice.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum RoleEnum {
    ADMIN(0),
    USER(1);

    private Integer roleCode;
}
