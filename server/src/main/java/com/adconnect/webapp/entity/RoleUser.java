package com.adconnect.webapp.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleUser {
    private Integer id;
    private Integer roleId;
    private Integer userId;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Boolean is_active;
}
