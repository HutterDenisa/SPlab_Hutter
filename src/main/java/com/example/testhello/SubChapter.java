package com.example.testhello;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SubChapter {
    private String name;
    private List<Element> elementList;
    public SubChapter(String name){
        this.name = name;
        this.elementList = new ArrayList<>();
    }

    public void createNewParagraph(String name) {
        elementList.add(new Paragraph(name));
    }

    public void createNewImage(String name) {
        elementList.add(new Image(name));
    }

    public void createNewTable(String name) {
        elementList.add(new Table(name));
    }

    public void print(){
        System.out.println("Subchapter: " + this.name);

        for (Element element : elementList){
            element.print();
        }
    }
}
