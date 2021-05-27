package jp.te4a.spring.boot.myapp6;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookBean{
       Integer id;
       String title;
       String write;
       String publisher;
       Integer price;
}