package com.zlobasss.notebas.entity;

import jakarta.persistence.Table;
import lombok.*;

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
