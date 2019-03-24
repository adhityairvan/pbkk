package com.pbkk.demoxml;
import com.pbkk.demoxml.Interface.Shape;

public class AppXML{
    private Shape square;

    public AppXML(Shape square){
        this.square = square;
    }

    public void drawShape() {
        square.draw();
    }
}