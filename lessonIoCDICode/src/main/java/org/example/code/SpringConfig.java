package org.example.code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:music.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic("Classic Music");
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public List<Music> musicTypeList() {
        List<Music> list = new ArrayList<>();
        list.add(rockMusic());
        list.add(jazzMusic());
        list.add(classicMusic());
        return list;
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicTypeList());
    }

}
