package org.example.code;

import org.springframework.beans.factory.annotation.Value;

public class JazzMusic implements Music {

    @Value("${jazzMusic.name}")
    private String name;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + name);
    }
}
