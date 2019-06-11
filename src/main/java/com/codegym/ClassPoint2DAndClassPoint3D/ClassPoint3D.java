package com.codegym.ClassPoint2DAndClassPoint3D;

public class ClassPoint3D extends ClassPoint2D {
    private float z = 0.0f;

    public  ClassPoint3D() {
    }

    public ClassPoint3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    @Override
    public float[] getXY() {
        float[] arr = {super.getX(), super.getY(), getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point 3D has coordinate (" + super.getX() + ", " + super.getY() + ", " + getZ() + ")";
    }
}
