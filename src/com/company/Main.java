package com.company;

public class Main {

    public static void main(String[] args) {
            Fish fish = new Fish();
            fish.setName("Forel");
            fish.setWeight(5);
            fish.setAge(2);
            fish.setColour("red");
            System.out.println(fish.getName());
            System.out.println(fish.getWeight());
            System.out.println(fish.getAge());
            System.out.println(fish.getColour());
    }
}
