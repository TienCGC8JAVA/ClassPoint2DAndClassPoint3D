package com.codegym.ClassPoint2DAndClassPoint3D;

public class ClassPoint2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public ClassPoint2D() {
    }

    public ClassPoint2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] arr ={getX(), getY()};
        return  arr;
    }

    public String toString() {
        return "Point 2D has coordinate (" + getX() + ", " + getY() + ")";
    }
}
