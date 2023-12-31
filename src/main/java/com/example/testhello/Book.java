package com.example.testhello;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Book {
    private String title;
    private List<Author> authorList;
    private List<Chapter> chapterList;

    public Book(String title) {
        this.title = title;
        this.chapterList = new ArrayList<>(); // Here a new chapter list is initialized
        this.authorList = new ArrayList<>(); // Here a new author list is initialized
    }

    public void addAuthor(Author authorName){
        authorList.add(authorName);
    }

    public int createChapter(String chapterTitle) {
        Chapter newChapter = new Chapter(chapterTitle);
        chapterList.add(newChapter);
        return chapterList.indexOf(newChapter);
    }

    public Chapter getChapter(int index) {
        if (index >= 0 && index < chapterList.size()) {
            return chapterList.get(index);
        } else {
            return null;
        }
    }

    public void print(){
        System.out.println("Book: " + this.title);
        for(Author author:authorList){
            author.print();
        }

        for(Chapter chapter:chapterList){
            chapter.print();
        }
    }
}
