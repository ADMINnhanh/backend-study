package org.dog;

import javazoom.jl.player.Player;


public class Dog {
    String name;
    int age;
    String color;


    public void cry() {

        new Thread(() -> {
            try {
                Player player = new Player(ClassLoader.getSystemResourceAsStream("audio/dog.mp3"));
                player.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}