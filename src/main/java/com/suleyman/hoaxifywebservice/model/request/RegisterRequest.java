package com.suleyman.hoaxifywebservice.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @Length(min = 5,max = 50)
    @NotBlank
    private String username;
    @Length(min = 5,max = 50)
    @NotBlank
    private String displayName;
    @Length(min = 6,max = 36)
    @NotBlank
    private String password;
    @NotBlank
    private String email;
}
