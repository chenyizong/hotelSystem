package main;





import javax.swing.*;

import presentation.controller.controller;

import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by huihantao on 2016/11/16.
 */
public class abc {
    public static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("xxxxx");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controller con = new controller(frame);

    }
}