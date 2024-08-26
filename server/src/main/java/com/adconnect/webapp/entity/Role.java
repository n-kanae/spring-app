package com.adconnect.webapp.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private Integer id;
    private String role_name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Boolean is_active;
}
