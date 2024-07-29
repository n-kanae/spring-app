package com.adconnect.webapp.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String kana;
    private String email;
    private String password;
    private String image;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Boolean is_active;
}
