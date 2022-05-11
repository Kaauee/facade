package com.mycompany.unisul_facade;


public class FacadePatternDemo {

    public static void main(String[] args) {
     ShapeMaker shapeMaker = new ShapeMaker();
     
     shapeMaker.drawCircle();
     shapeMaker.drawRetangle();
     shapeMaker.drawSquare();
     shapeMaker.drawTriangle();
    }
    
}
