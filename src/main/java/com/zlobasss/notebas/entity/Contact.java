package com.zlobasss.notebas.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

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
