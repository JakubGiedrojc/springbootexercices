package com.example.springbasics.songs;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SongConfiguration {

    @Bean
    public Song track1(){return new Song("Ti amo","Eros Ramazzotti");}

    @Bean
    @Scope("prototype")
    public Song track2(){return new Song("Enter The Sandman","Metallica");}

    @Bean
    public Song track3(){return new Song("Helvegen","Wardruna");}


}
