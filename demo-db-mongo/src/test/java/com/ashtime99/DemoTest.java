package com.ashtime99;

import com.ashtime99.db.MongoDemoApplication;
import com.ashtime99.db.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试
 *
 * @author xiayichao
 * @version 1.0
 */
@SpringBootTest(classes = {MongoDemoApplication.class})
public class DemoTest {
    @Resource
    private MongoTemplate mongoTemplate;

    // 添加操作
    @Test
    void contextLoads() {
        Book book = new Book();
        book.setBookName("海绵宝宝");
        book.setBookNumber(10);
        book.setCreateTime("2023-10-12");
        Book ans = mongoTemplate.insert(book);
        System.out.println(ans);
    }

    // 查询所有记录
    @Test
    public void findAll() {
        List<Book> bookList = mongoTemplate.findAll(Book.class);
        System.out.println(bookList);
    }


}
