package com.suleyman.hoaxifywebservice.repository;

import com.suleyman.hoaxifywebservice.entity.VerifyCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerifyCodeRepository extends JpaRepository<VerifyCodeEntity,Long> {
}
