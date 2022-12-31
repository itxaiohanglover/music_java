package com.example.demo;

import com.example.demo.play.Animation;
import com.example.demo.play.AudioPlay;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

//@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextMusic() {
        String notes =
                " 3  3   3   3   3   3  3   3   4   2   2   2   2   2   2   3 \n" ;

//        String note1 = "";

        new AudioPlay(180).loadNotes(notes).start();
//        new AudioPlay(180).loadNotes(accompaniments + accompaniments1).start();
        new Animation(180).loadNotes(notes).start();
    }

}
