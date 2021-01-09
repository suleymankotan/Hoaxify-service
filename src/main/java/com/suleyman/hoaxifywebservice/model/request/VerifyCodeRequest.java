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
public class VerifyCodeRequest {
    @NotBlank
    @Length(min = 6,max = 10)
    private String code;
    @NotBlank
    private String username;
}
