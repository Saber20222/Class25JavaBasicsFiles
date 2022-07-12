package com.syntax.class25;

public interface Shape {
    /*Create an Interface 'Shape' with undefined methods as
    calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements
    functionality defined in the Shape Interface. Test your code.*/

    void calculateArea();
    void calculateParameter();

}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("A="+3.14*36);
    }

    @Override
    public void calculateParameter() {
        System.out.println("C="+2*3.14*6);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("A = "+(4*4));
    }

    @Override
    public void calculateParameter() {
        System.out.println("P = "+(2*4));
    }
}
class Test{
    public static void main(String[] args) {
        Shape []shape={new Circle(),new Square()};
        for(Shape sh:shape){
            sh.calculateArea();
            sh.calculateParameter();
        }
    }
}
