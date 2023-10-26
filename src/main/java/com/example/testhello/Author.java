package com.example.testhello;


import lombok.Data;

@Data
public class Author {
    public String name;

    public Author(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Author name: " + this.name);
    }
}
