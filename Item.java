package Oop;

import hoctap.oop.Person;

import java.util.Scanner;

public class Item {
   private String name ;
   private int weight;

    public Item (String name) {
       this.name = name;
    }
    public Item (String name, int weight) {
        this.name = name ;
        this.weight = weight ;
    }
    public int Weight() {
        return this.weight;
    }
    @Override
    public String toString() {
        return "Item [ weight=" + weight +  ", name=" + name + "]";
    }
}
