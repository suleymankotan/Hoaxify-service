package com.suleyman.hoaxifywebservice.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS",schema = "HOAXIFY")
@SequenceGenerator(name = "USERS_ID_SEQ",allocationSize = 1,sequenceName = "HOAXIFY.USERS_ID_SEQ")
public class UsersEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "USERS_ID_SEQ")
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "DISPLAY_NAME",length = 50,unique = true)
    private String displayName;
    @Column(name = "USER_NAME",length = 50,unique = true)
    private String username;
    @Column(name = "EMAIL",length = 50)
    private String email;
    @Column(name = "PASSWORD",length = 250)
    private String password;
    @Column(name = "ROLE")
    private Integer role;
    @Column(name = "ACTIVE")
    private Boolean active;
    @Column(name = "REGISTER_DATE")
    private LocalDateTime registerDate;
}
