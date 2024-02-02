package com.zlobasss.notebas.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
@Data
@Table(name = "user")
public class User {
    private long id;
    private String username;
    private String password;
}