package com.example.demo.play;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author xh
 * @Date 2022/12/30
 */
public class FileUtils {
    static void play(String musicName) {
        System.out.println("载入歌曲：" + musicName);
        String path =
                new File("").getAbsolutePath() + File.separator + "src/main/resources/notes" + File.separator;
        String notesPath = path + musicName +  ".notes";
        String accompanimentsPath = path + musicName +  ".accompaniments";
        String notes = fileToStr(notesPath);
        String accompaniments = fileToStr(accompanimentsPath);
        new AudioPlay(180).loadNotes(notes).start();
        new AudioPlay(180).loadNotes(accompaniments).start();
        new Animation(180).loadNotes(notes).start();
    }

    static String fileToStr(String musicPath) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(musicPath));
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            // 删除最后一个新行分隔符
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();
        } catch (Exception ignored) {}
        return stringBuilder.toString();
    }
}
