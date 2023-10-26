package com.example.testhello;

import lombok.Data;

@Data
public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }


    public void print() {
        System.out.println("Image with name:" + this.imageName);
    }
}
