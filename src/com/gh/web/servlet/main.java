package com.gh.web.servlet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gh.web.servlet.pojo.Books;


import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        //用来转换 json的工具
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            //obj -> json
            /*Book book = new Book(1,"a",2,"b");
            String json = objectMapper.writeValueAsString(book);
            System.out.println(json);*/

            //json - obj
            String json = "{\"booksID\":1,\"booksName\":\"a\",\"booksCount\":2,\"details\":\"b\"}";
            Books books = objectMapper.readValue(json,Books.class);
            System.out.println(books);

//            List<Books> books = Arrays.asList(
//                    new Books(1,"a",1,"a"),
//                    new Books(2,"a1",11,"a1"),
//                    new Books(3,"a11",111,"a11")
//            );
//            String json = objectMapper.writeValueAsString(books);
//            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
