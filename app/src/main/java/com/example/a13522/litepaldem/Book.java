package com.example.a13522.litepaldem;

import org.litepal.crud.DataSupport;

/**
 * Created by 13522 on 2017/7/14.
 */

public class Book extends DataSupport {
    private int Id;
    private String author;
    private double price;
    private int pages;
    private String name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
