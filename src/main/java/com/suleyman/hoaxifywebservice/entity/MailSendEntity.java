package com.suleyman.hoaxifywebservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MAIL_SEND",schema = "HOAXIFY")
@SequenceGenerator(name = "MAIL_SEND_ID_SEQ",allocationSize = 1,sequenceName = "HOAXIFY.MAIL_SEND_ID_SEQ")
public class MailSendEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "MAIL_SEND_ID_SEQ")
    private Long id;

    private Long userId;

    private String message;

    private Boolean status;

    private String formC;

    private String formT;

    private String mailType;
}
