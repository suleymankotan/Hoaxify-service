package com.suleyman.hoaxifywebservice.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    private Integer code;
    private String message;

    public static BaseResponse success(){
        return BaseResponse.builder().code(200).message("İşlem Başarılı.").build();
    }
}
