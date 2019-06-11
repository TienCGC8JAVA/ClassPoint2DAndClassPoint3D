package com.codegym.ClassPoint2D;

import com.codegym.ClassPoint2DAndClassPoint3D.ClassPoint2D;

public class ClassPoint2DTest {
    public static void main(String[] args) {
        ClassPoint2D classPoint2D = new ClassPoint2D();
        System.out.println(classPoint2D);

        classPoint2D = new ClassPoint2D(4.5f, 6.7f);
        System.out.println(classPoint2D);
    }
}
