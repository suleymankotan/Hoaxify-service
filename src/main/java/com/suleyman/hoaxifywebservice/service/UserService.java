package com.suleyman.hoaxifywebservice.service;


import com.suleyman.hoaxifywebservice.entity.MailSendEntity;
import com.suleyman.hoaxifywebservice.entity.UsersEntity;
import com.suleyman.hoaxifywebservice.exception.ErrorCode;
import com.suleyman.hoaxifywebservice.exception.HoaxifyWebServiceException;
import com.suleyman.hoaxifywebservice.model.enums.RoleEnum;
import com.suleyman.hoaxifywebservice.model.request.RegisterRequest;
import com.suleyman.hoaxifywebservice.model.request.VerifyCodeRequest;
import com.suleyman.hoaxifywebservice.model.response.BaseResponse;
import com.suleyman.hoaxifywebservice.repository.MailSendRepository;
import com.suleyman.hoaxifywebservice.repository.UsersRepository;
import com.suleyman.hoaxifywebservice.repository.VerifyCodeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Random;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UsersRepository usersRepository;
    private final MailSendRepository mailSendRepository;
    private final VerifyCodeRepository verifyCodeRepository;

    @Transactional
    public BaseResponse userRegister(RegisterRequest registerRequest){
        UsersEntity usersEntity = usersRepository.findByUsername(registerRequest.getUsername());

        if (usersEntity!=null)
            throw new HoaxifyWebServiceException(ErrorCode.USERNAME_NOT_NULL);

        final UsersEntity user =UsersEntity.builder()
                .username(registerRequest.getUsername())
                .displayName(registerRequest.getDisplayName())
                .email(registerRequest.getEmail())
                .password(registerRequest.getPassword())
                .registerDate(LocalDateTime.now())
                .role(RoleEnum.USER.getRoleCode())
                .active(true)
                .build();

        usersRepository.save(user);

        return BaseResponse.success();
    }

    private void verifyCodeSend(UsersEntity user){
        mailSendRepository.save( MailSendEntity.builder()
                .mailType("VerifyCode")
                .message(generatedVerifyCode())
                .status(false)
                .userId(user.getUserId())
                .formC(user.getEmail())
                .build());
    }

    private String generatedVerifyCode(){
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 6;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public BaseResponse userActiveEnable(VerifyCodeRequest request){

        return BaseResponse.success();
    }
}
