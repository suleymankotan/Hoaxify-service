package com.suleyman.hoaxifywebservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VERIFY_CODE",schema = "HOAXIFY")
@SequenceGenerator(name = "VERIFY_CODE_SEQ",allocationSize = 1,sequenceName = "HOAXIFY.VERIFY_CODE_SEQ")
public class VerifyCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "VERIFY_CODE_SEQ")
    private Long id;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "CODE",length = 5)
    private String code;
    @Column(name = "ACTIVE")
    private Boolean active;
    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;
    @Column(name = "EXPIRE_DATE")
    private LocalDateTime expireDate;
    @Column(name = "CODE_USED_DATE")
    private LocalDateTime usedDate;
}
