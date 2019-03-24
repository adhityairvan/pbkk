package com.pbkk.demoxml.Classes;
import com.pbkk.demoxml.Interface.Shape;

public class Square implements Shape{
    private float r;
    private float area;

    @Override
    public void draw(){
        System.out.println("a square has been drawed");
    }
    @Override 
    public float area(){
        return r*r;
    }

    public float getR() {
        return this.r;
    }


    public float getArea() {
        return this.area;
    }

    public void setArea() {
        this.area = this.area();
    }

    
}