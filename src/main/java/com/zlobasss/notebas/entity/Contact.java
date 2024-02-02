package com.zlobasss.notebas.entity;

import jakarta.persistence.Table;
import lombok.*;

@Table(name = "contact")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Contact {
    private long id;
    private String last;
    private String first;
    private String phone;
    private User author;
}
