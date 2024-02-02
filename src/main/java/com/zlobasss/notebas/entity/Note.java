package com.zlobasss.notebas.entity;

import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Table(name = "note")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Data
@ToString
public class Note {
    private long id;
    private String head;
    private String content;
    private Timestamp date;
    private User author;
}
