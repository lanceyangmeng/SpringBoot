package com.example.quickstart.entity;

import lombok.Data;

/**
 * white
 */
@Data
public class Card {
private String imgLink;
private String called;
private  String number;
public Card(){

}
public Card(String imgLink, String called, String  number){
    this.imgLink=imgLink;
    this.called=called;
    this.number=number;
  }

}
