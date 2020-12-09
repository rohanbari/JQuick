package com.rohanbari.jquick;

import com.rohanbari.jquick.classes.Box;

public class ProgramExecutor {
    public static void main(String[] args) {
        Box box = new Box(15.0, 23.0, 22.0);
        double volume = box.getVolume();
        System.out.println(volume);
        box.printVolume();
        Box nextBox = new Box(15.0, 23.0, 22.0);
        System.out.println(box.equalTo(nextBox));
    }
}
