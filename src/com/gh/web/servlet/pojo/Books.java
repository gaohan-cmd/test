package com.gh.web.servlet.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor //所有参构造
@NoArgsConstructor  //无参构造
@Data       //get\set\toStrong
public class Books {

    private int booksID;
    private String booksName;
    private int booksCount;
    private String details;
}
