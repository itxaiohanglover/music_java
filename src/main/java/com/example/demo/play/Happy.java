package com.example.demo.play;

/**
 * @author xh
 * @Date 2022/12/27
 */
public class Happy {
    public static void main(String[] args) {
        // 其他谱子在notes下，如：生日快乐_300
        String musicName = "蜜雪冰城_150";
        FileUtils.play(musicName);
    }

}
