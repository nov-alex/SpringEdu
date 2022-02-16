package org.example.code;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClassicMusic implements Music {

    private final String name;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + name);
    }
}
