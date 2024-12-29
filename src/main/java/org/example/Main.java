package org.example;

import org.opencv.core.Core;

public class Main {
    static {
        // טעינת ספריית OpenCV
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        // בדיקה אם OpenCV נטען בהצלחה
        try {
            System.out.println("OpenCV version: " + Core.VERSION);
            System.out.println("OpenCV loaded successfully!");
        } catch (Exception e) {
            System.err.println("Failed to load OpenCV!");
            e.printStackTrace();
        }

        // שאר הקוד שלך
        Window window = new Window();
        window.showWindow();
    }
}
