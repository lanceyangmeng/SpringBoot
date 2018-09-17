package com.example.quickstart.entity;

import lombok.Data;

/**
 * white
 */
@Data

public class Pai {
    private String title;
    private String pic;
    private String number;
    public Pai(){

    }
    public Pai(String pic, String title, String number){
this.pic=pic;
this.title=title;
this.number=number;
    }
}
