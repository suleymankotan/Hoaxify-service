package com.suleyman.hoaxifywebservice.repository;

import com.suleyman.hoaxifywebservice.entity.MailSendEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailSendRepository extends JpaRepository<MailSendEntity,Long> {
}
