package org.example.spring.beanfactory.shapes;

public class Drawing {

    private Shape shape;

    public Drawing(Shape shape){
        this.shape = shape;
    }

    public void drawShape(){
        shape.draw();
    }

}
