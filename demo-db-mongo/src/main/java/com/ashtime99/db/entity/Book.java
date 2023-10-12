package com.ashtime99.db.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 书
 *
 * @author xiayichao
 * @version 1.0
 */
@Data
@Document("Book")
public class Book {
    @Id
    private String id;
    private String bookName;
    private Integer bookNumber;
    private String createTime;
}
