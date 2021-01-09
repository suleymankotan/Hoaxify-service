package com.suleyman.hoaxifywebservice.repository;

import com.suleyman.hoaxifywebservice.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
    UsersEntity findByUsername(String username);
}
